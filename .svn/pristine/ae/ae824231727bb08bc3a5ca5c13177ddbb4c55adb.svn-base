package com.jz.quoteoperation.replyself.controller;

import com.jz.quoteoperation.replyself.po.WechatReplySelf;
import com.jz.quoteoperation.replyself.service.WechatReplySelfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/wechatReplySelfController")
public class WechatReplySelfController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WechatReplySelfService  wechatReplySelfService;


    /**
     * 进入列表
     * @param map
     * @return
     */
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @RequestMapping(value = "/index")
    public String index(ModelMap map, String replytype,String keyword){

        if(replytype==null){
            replytype="1";
        }
        Map<String,Object>parmmap=new HashMap<String,Object>();
        parmmap.put("replytype",replytype);
        parmmap.put("keyword",keyword);
        List<WechatReplySelf> list=wechatReplySelfService.selectWechatReplySelfList(parmmap);
        map.put("list",list);
        map.put("replytype",replytype);
        map.put("keyword",keyword);

        return "/replycontent/replycontentlist.html";
    }

    /**
     *进入编辑页面之前
     * @param map
     * @return
     */

    @RequestMapping(value = "/beforeedit")
    public String beforeedit(ModelMap map,Integer lgcsn){

        if(lgcsn!=null){
            Map<String,Object> map1=new HashMap();
            map1.put("lgcsn",lgcsn);
            WechatReplySelf wechatReplySelf=wechatReplySelfService.selectwechatReplySelf(map1);
            map.put("lgcSn",wechatReplySelf.getLgcSn());
            map.put("replytype",wechatReplySelf.getReplytype());
            map.put("keyword",wechatReplySelf.getKeyword());
            map.put("replycontent",wechatReplySelf.getReplycontent());
        }else{
            map.put("lgcSn","");
            map.put("replytype","");
            map.put("keyword","");
            map.put("replycontent","");
        }

        return "/replycontent/editreplycontent.html";
    }

    /**
     *编辑
     * @param
     * @return
     */
    @RequestMapping(value = "/saveorupdate")
    public String saveorupdate(WechatReplySelf wechatReplySelf){


        if(wechatReplySelf.getLgcSn()!=null){
            wechatReplySelfService.update(wechatReplySelf);
        }else{
            wechatReplySelfService.insert(wechatReplySelf);
        }

        return "redirect:/wechatReplySelfController/index";
    }

    /**
     *删除
     * @param
     * @return
     */
    @RequestMapping(value = "/delete")
    public String delete(Integer id){
        Map<String,Object> map=new HashMap();
        map.put("lgcSn",id);
        wechatReplySelfService.deletebyid(map);
        return "redirect:/wechatReplySelfController/index";
    }

    //wechatReplySelfController/checkkeyword

    /**
     * 校验关键字是否重复 重复返回1 不重复返回2
     * @param keyword
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/checkkeyword")
    public String checkkeyword(String keyword){
        Map<String,Object>map=new HashMap<String,Object>();
        map.put("keyword",keyword);
        int count=wechatReplySelfService.checkkeyword(map).size();
        if(count==0){
            return "2";
        }else{
            return "1";
        }


    }
}
