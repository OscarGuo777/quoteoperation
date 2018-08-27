package com.jz.quoteoperation.wechat.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jz.quoteoperation.wechat.Feigninterface.FeignHttp;
import com.jz.quoteoperation.wechat.po.WechatGroup;
import com.jz.quoteoperation.wechat.service.WechatGroupService;
import com.jz.quoteoperation.wechat.util.HttpClientUtil;
import com.jz.quoteoperation.wechat.util.PublicConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/wechatGroupController")
public class WechatGroupController {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WechatGroupService wechatGroupSerice;

    @Autowired
    private FeignHttp feignHttp;
    /**
     * 进入列表
     * @param map
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(ModelMap map, String groupname){

        Map<String,Object>parmmap=new HashMap<String,Object>();
        parmmap.put("groupname",groupname);
        List<WechatGroup>list=wechatGroupSerice.selectWechatGroupList(parmmap);
        map.put("list",list);
        map.put("groupname",groupname);
        return "/wechatgroup/grouplist.html";
    }

    /**
     *进入编辑页面之前
     * @param map
     * @return
     */

    @RequestMapping(value = "/beforeedit")
    public String beforeedit(ModelMap map,Integer lgcsn){
        Map<String,Object> map1=new HashMap<String,Object>();
        if(lgcsn!=null){
            map.put("lgcSn",lgcsn);
            map1.put("lgcsn",lgcsn);
            WechatGroup w=wechatGroupSerice.selectWechatGroup(map1);
            map.put("groupname",w.getGroupname());
            map.put("lgcSn",w.getLgcSn());
        }else{

            map.put("groupname","");
            map.put("lgcSn","");
        }
        return "/wechatgroup/editgroup.html";
    }

    /**
     *
     *编辑
     * @param
     * @return
     */
    @RequestMapping(value = "/saveorupdate")
    public String saveorupdate(WechatGroup wechatGroup, String optusername){

        if(wechatGroup.getLgcSn()!=null&&!"".equals(wechatGroup.getLgcSn())){
            wechatGroup.setUptUsrId(optusername);
            wechatGroup.setUptDt(new Date());
            wechatGroupSerice.update(wechatGroup);
            Map<String, Object> map1 = new HashMap();
            Map<String, Object> map2 = new HashMap();
            map2.put("name", wechatGroup.getGroupname());
            map2.put("id", wechatGroup.getLgcSn());
            map1.put("group", map2);
            JSONObject jsonobject = new JSONObject(map1);
            String json = JSON.toJSONString(jsonobject);
            String result=HttpClientUtil.doPostSSL( "https://api.weixin.qq.com/cgi-bin/groups/update?access_token="+PublicConstant.accessToken,json);
            logger.info(result);

            JSONObject jo = JSONObject.parseObject(result);

            if("0".equals(jo.get("errcode").toString())){  //成功的
                wechatGroupSerice.update(wechatGroup);
            }else{
                //Map<String, Object> error = jo.getJSONObject("result");
                logger.info(jo.get("errcode").toString()+"-----"+jo.get("errmsg").toString());
            }

        }else{
            wechatGroup.setCrtDt(new Date());
            wechatGroup.setCrtUsrId(optusername);

            Map<String, Object> map1 = new HashMap();
            Map<String, Object> map2 = new HashMap();
            map2.put("name", wechatGroup.getGroupname());
            map1.put("group", map2);
            //FeignHttp.a="POST  https://api.weixin.qq.com/cgi-bin/groups/create?access_token="+PublicConstant.accessToken;
            JSONObject jsonobject = new JSONObject(map1);
            String json = JSON.toJSONString(jsonobject);
            String result=HttpClientUtil.doPostSSL( "https://api.weixin.qq.com/cgi-bin/groups/create?access_token="+PublicConstant.accessToken,json);
            logger.info(result);

            JSONObject jo = JSONObject.parseObject(result);
            Map<String, Object> map = jo.getJSONObject("group");
            if(map!=null){
                wechatGroup.setLgcSn(map.get("id").toString());
                wechatGroupSerice.insert(wechatGroup);
            }else{ // 调用错误时
                Map<String, Object> error = jo.getJSONObject("result");

                logger.info(jo.get("errcode").toString()+"-----"+jo.get("errmsg").toString());
            }


        }
        return "redirect:/wechatGroupController/index";
    }

    /**
     *删除
     * @param
     * @return
     */
    @RequestMapping(value = "/delete")
    public String delete(Integer id){

        return "redirect:/wechatGroupController/index";
    }

    /**
     * 用户与分组相关联 查左边分组的
     * @param map
     * @return
     */
    @RequestMapping(value = "/grouplist")
    public String grouplist(ModelMap map){

        List<WechatGroup>list=wechatGroupSerice.selectWechatGroupAllList();
        map.put("list",list);
        map.put("groupid","");
        return "/wechatgroup/usergrouplist.html";
    }
    /**
     * 用户与分组相关联 查右边用户的
     * @param map
     * @return
     */
    @RequestMapping(value = "/selectuser")
    public String selectuser(Model  map,String groupid){
        Map<String,Object>parmmap=new HashMap<String,Object>();

        parmmap.put("lgcsn",groupid);
        List<Map<String,Object>>userlist=wechatGroupSerice.selectuser(parmmap);  //查询右边的关联的人
        map.addAttribute("userlist",userlist);
        List<WechatGroup>list=wechatGroupSerice.selectWechatGroupAllList();//查询左边分组 把选的那个分组id也传过去
        map.addAttribute("list",list);
        map.addAttribute("groupid",groupid);
        return "/wechatgroup/usergrouplist.html";
    }

    /**
     * b保存关联的分组和用户
     * @param map
     * @param form2groupid
     * @return
     */
    @RequestMapping(value = "/saveusergroup")
    public String saveusergroup(Model map, String form2groupid, String []selectuseracnt){

        logger.info(form2groupid+"----------"+selectuseracnt);
        Map<String,Object> map1=new HashMap();
        map1.put("form2groupid",form2groupid);
        //先根据分组id将原来的关联都删了 然后再新增
        wechatGroupSerice.delusergroup(map1);
        for(int i=0;i<selectuseracnt.length;i++){
            map1.put("usracnt",selectuseracnt[i].split(",")[0]);

            Map<String, Object> map2 = new HashMap();
            map2.put("openid",selectuseracnt[i].split(",")[1]);
            map2.put("to_groupid",form2groupid);
            JSONObject jsonobject = new JSONObject(map2);
            String json = JSON.toJSONString(jsonobject);
            String result=HttpClientUtil.doPostSSL( "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token="+PublicConstant.accessToken,json);
            logger.info(result);

            JSONObject jo = JSONObject.parseObject(result);

            if("0".equals(jo.get("errcode").toString())){  //成功的
                wechatGroupSerice.saveusergroup(map1);
            }else{

                logger.info(jo.get("errcode").toString()+"-----"+jo.get("errmsg").toString());
            }

        }


        return "forward:/wechatGroupController/selectuser?groupid="+form2groupid;
    }

}
