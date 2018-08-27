package com.jz.quoteoperation.wechat.controller;

import com.jz.quoteoperation.replyself.po.WechatReplySelf;
import com.jz.quoteoperation.replyself.service.WechatReplySelfService;
import com.jz.quoteoperation.wechat.util.HttpClientUtil;
import com.jz.quoteoperation.wechat.util.PublicConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jz.quoteoperation.wechat.util.Decript;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

@Controller
@RequestMapping(value = "/wechatAccess")
public class WechatAccess {

    private final String token = "meichao";
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WechatReplySelfService wechatReplySelfService;

    /**
     * 微信接入入口     url   http://80端口地址+/wechatAccess/index
     */
    @RequestMapping(value = "/index")
    public void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod().toLowerCase();
        response.setCharacterEncoding("UTF-8");
        logger.info("method类型====" + method);
        String timestamp;
        if ("get".equals(method))
        {
            logger.info("进入签名校验get方法====");
            String signature = request.getParameter("signature");
            timestamp = request.getParameter("timestamp");
            String nonce = request.getParameter("nonce");
            String echostr = request.getParameter("echostr");
            logger.info("signature==" + signature);
            logger.info("timestamp==" + timestamp);
            logger.info("nonce==" + nonce);
            logger.info("echostr==" + echostr);

            ArrayList<String> array = new ArrayList();
            array.add(signature);
            array.add(timestamp);
            array.add(nonce);

            String sortString = sort(token, timestamp, nonce);

            String mytoken = Decript.SHA1(sortString);
            if ((mytoken != null) && (mytoken != "") && (mytoken.equals(signature)))
            {
                logger.info("签名校验通过");
                response.getWriter().print(echostr);
            }
            else
            {
                logger.info("签名校验失败");
            }
        }
        else if ("post".equals(method))
        {
            logger.info("进入了post方法");

           try
            {
                HttpClientUtil.map = parseXML(request);
                for (Map.Entry<String, String> entry : HttpClientUtil.map.entrySet())
                {
                    System.out.println("key:" + (String)entry.getKey());
                    System.out.println("value:" + (String)entry.getValue());
                    System.out.println((String)entry.getKey() + ":=" + (String)entry.getValue());
                }
                String eventtype = (String)HttpClientUtil.map.get("Event");
                logger.info("事件类型 eventtype==" + eventtype);// 事件类型
                if ("subscribe".equals(eventtype))  //关注
                {
                    String openid = (String)HttpClientUtil.map.get("FromUserName");
                    logger.info("当前关注用户的 openid====" + openid);

                    String sendXML = createXML("", eventtype);
                    logger.info("sendXML==" + sendXML);

                    response.getWriter().print(sendXML);
                }
                if ("unsubscribe".equals(eventtype))// 取消关注
                {
                    String openid = (String)HttpClientUtil.map.get("FromUserName");
                    System.out.println("取消关注的用户的 openid====" + openid);
                    Map<String, Object> map = new HashMap();
                    map.put("openid", openid);
                    //this.wxSelfReplyService.deletewxuserinfo(map);
                }
                if("MASSSENDJOBFINISH".equals(eventtype)){//  这个群发成功返回给我们服务 的事件
                    /**    这是 返回给我们的 xml   日后也许能用上
                     * <xml><ToUserName><![CDATA[gh_28bed6dd5b2e]]></ToUserName>
                     * <FromUserName><![CDATA[ocMWk1SgF_y7B9BzccrdA2xg4bxk]]></FromUserName>
                     * <CreateTime>1535074242</CreateTime>
                     * <MsgType><![CDATA[event]]></MsgType>
                     * <Event><![CDATA[MASSSENDJOBFINISH]]></Event>
                     * <MsgID>1000000002</MsgID>
                     * <Status><![CDATA[send success]]></Status>
                     * <TotalCount>2</TotalCount>
                     * <FilterCount>2</FilterCount>
                     * <SentCount>2</SentCount>
                     * <ErrorCount>0</ErrorCount>
                     * <CopyrightCheckResult><Count>0</Count>
                     * <ResultList/>
                     * <CheckState>0</CheckState>
                     * </CopyrightCheckResult>
                     * </xml>
                     */
                }
                if(eventtype==null){
                    String sendXML = createXML((String)HttpClientUtil.map.get("Content"), eventtype);
                    response.getWriter().print(sendXML);
                }

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
    }

    public static String sort(String token, String timestamp, String nonce)
    {
        String[] strArray = { token, timestamp, nonce };
        Arrays.sort(strArray);
        StringBuilder s = new StringBuilder();
        String[] arrayOfString1;
        int j = (arrayOfString1 = strArray).length;
        for (int i = 0; i < j; i++)
        {
            String str = arrayOfString1[i];
            s.append(str);
        }
        return s.toString();

    }
    public Map<String, String> parseXML(HttpServletRequest request) throws Exception
        {
            Map<String, String> map = new HashMap();

            InputStream in = request.getInputStream();

            SAXReader reader = new SAXReader();
            Document d = reader.read(in);
            String requestXML = d.asXML();
            String subXML = requestXML.split(">")[0] + ">";
            requestXML = requestXML.substring(subXML.length());

            Element root = d.getRootElement();
            List<Element> elementList = root.elements();
            for (Element e : elementList) {
                map.put(e.getName(), e.getText());
            }
            map.put("requestXML", requestXML);

            in.close();
            return map;
        }

    /**
     * 被动回复信息以及关注是发送欢迎语
     * @param keycode
     * @param eventtype
     * @return
     */

    public String createXML(String keycode, String eventtype)
    {
        Map<String, String> map = HttpClientUtil.map;
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String xml = "<xml>";
        if ("subscribe".equals(eventtype))
        {

            xml = xml + "<ToUserName><![CDATA[" + (String)map.get("FromUserName") + "]]></ToUserName>";
            xml = xml + "<FromUserName><![CDATA[" + (String)map.get("ToUserName") + "]]></FromUserName>";
            xml = xml + "<CreateTime>" + sdf.format(d) + "</CreateTime>";
            xml = xml + "<MsgType><![CDATA[text]]></MsgType>";
            xml = xml + "<Content><![CDATA[" + PublicConstant.followWelcoming  + "]]></Content>";

        }
        if(eventtype==null){
            //boolean isValid = wechatReplySelfService.valikeyword(keycode);
            /*if (!isValid)
            {*/
                // WxSelfReply wxselfreply = this.wxSelfReplyService.selectkeyword(keycode);
                Map<String,Object>map1=new HashMap<String,Object>();
                map1.put("keyword",keycode);
                WechatReplySelf wechatReplySelf = wechatReplySelfService.wechatReplySelf(map1);
                xml = xml + "<ToUserName><![CDATA[" + (String)map.get("FromUserName") + "]]></ToUserName>";
                xml = xml + "<FromUserName><![CDATA[" + (String)map.get("ToUserName") + "]]></FromUserName>";
                xml = xml + "<CreateTime>" + sdf.format(d) + "</CreateTime>";

                if(wechatReplySelf!=null){
                    if("1".equals(wechatReplySelf.getReplytype())){
                        xml = xml + "<MsgType><![CDATA[text]]></MsgType>";
                    }
                    xml = xml + "<Content><![CDATA[" + wechatReplySelf.getReplycontent() + "]]></Content>";
                }else{

                    xml = xml + "<MsgType><![CDATA[text]]></MsgType>";

                    xml = xml + "<Content><![CDATA[抱歉你发送的信息没有匹配上]]></Content>";
                }

               // xml = xml + "<MsgType><![CDATA[" + wechatReplySelf.get + "]]></MsgType>";
               // if ("text".equals(msgtype)) {

              //  }
 /*               if ("image".equals(msgtype))
                {
                    xml = xml + "<Image>";
                    xml = xml + "<MediaId><![CDATA[" + wxselfreply.getMediaid() + "]]></MediaId>";
                    xml = xml + "</Image>";
                }
                "voice".equals(msgtype);
                if ("video".equals(msgtype))
                {
                    xml = xml + "<Video>";
                    xml = xml + "<MediaId><![CDATA[" + wxselfreply.getMediaid() + "]]></MediaId>";
                    xml = xml + "<Title><![CDATA[" + wxselfreply.getTitle() + "]]></Title>";
                    xml = xml + "<Description><![CDATA[" + wxselfreply.getDescription() + "]]></Description>";
                    xml = xml + "</Video>";
                }
                if ("music".equals(msgtype))
                {
                    xml = xml + "<Music>";
                    xml = xml + "<MusicURL><![CDATA[" + wxselfreply.getMusicURL() + "]]></MusicURL>";
                    xml = xml + "<HQMusicUrl><![CDATA[" + wxselfreply.getHqmusicurl() + "]]></HQMusicUrl>";
                    xml = xml + "<ThumbMediaId><![CDATA[" + wxselfreply.getThumbmediaid() + "]]></ThumbMediaId>";
                    xml = xml + "<Title><![CDATA[" + wxselfreply.getTitle() + "]]></Title>";
                    xml = xml + "<Description><![CDATA[" + wxselfreply.getDescription() + "]]></Description>";
                    xml = xml + "</Music>";
                }
                if ("news".equals(msgtype))
                {
                    xml = xml + "<Articles>";
                    for (int i = 0; i < Integer.parseInt(wxselfreply.getArticlecount()); i++)
                    {
                        xml = xml + "<item>";
                        xml = xml + "<Title><![CDATA[" + wxselfreply.getPictitle().split(",")[i] + "]]></Title>";
                        xml = xml + "<Description><![CDATA[" + wxselfreply.getPicdescription().split(",")[i] + "]]></Description>";
                        xml = xml + "<PicUrl><![CDATA[" + wxselfreply.getPicurl().split(",")[i] + "]]></PicUrl>";
                        xml = xml + "<Url><![CDATA[" + wxselfreply.getUrl().split(",")[i] + "]]></Url>";
                        xml = xml + "</item>";
                    }
                    xml = xml + "</Articles>";
                }*/

            //}
        }

        xml = xml + "</xml>";
        return xml;
    }
}
