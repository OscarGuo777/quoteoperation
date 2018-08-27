package com.jz.quoteoperation.version.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jz.quoteoperation.version.po.VersionInfo;
import com.jz.quoteoperation.version.service.VersionService;
import com.jz.quoteoperation.wechat.po.WechatGroup;
import com.jz.quoteoperation.wechat.service.WechatGroupService;
import com.jz.quoteoperation.wechat.util.HttpClientUtil;
import com.jz.quoteoperation.wechat.util.PublicConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/versionController")
public class VersionController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private VersionService versionService;

    @Autowired
    private WechatGroupService wechatGroupSerice;

    /**
     * 进入列表
     * @param map
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(ModelMap map, String vrsnSn){

        map.put("vrsnSn",vrsnSn);

        Map<String,Object>parmmap=new HashMap<String,Object>();
        parmmap.put("vrsnSn",vrsnSn);
        List<VersionInfo>list=versionService.selectVersionInfoList(parmmap);
        map.put("list",list);
        List<WechatGroup>grouplist=wechatGroupSerice.selectWechatGroupAllList();//查询全部分组
        map.put("grouplist",grouplist);

        return "/version/versionInfolist.html";
    }

    /**
     *进入编辑页面之前
     * @param map
     * @return
     */

    @RequestMapping(value = "/beforeedit")
    public String beforeedit(ModelMap map,Integer lgcsn){

        if(lgcsn!=null){ //编辑
            Map<String,Object> map1=new HashMap();
            map1.put("lgcSn",lgcsn);
            VersionInfo versionInfo=versionService.selecVersionInfo(map1);
            map.put("lgcSn",versionInfo.getLgcSn());
            map.put("vrsnSn",versionInfo.getVrsnSn());
            map.put("vrsnDesc",versionInfo.getVrsnDesc());
            map.put("upldLnk",versionInfo.getUpldLnk());
            map.put("upldPwd",versionInfo.getUpldPwd());
        }else{//新增
            map.put("lgcSn","");
            map.put("vrsnSn","");
            map.put("vrsnDesc","");
            map.put("upldLnk","");
            map.put("upldPwd","");
        }

        return "/version/editVersionInfo.html";
    }

    /**
     *
     *编辑
     * @param
     * @return
     */
    @RequestMapping(value = "/saveorupdate")
    public String saveorupdate(VersionInfo versionInfo,String optusername){
        //还有用户信息 没有加进去 只新增和修改基础信息
        if(versionInfo.getLgcSn()!=null){
            versionInfo.setUpdDt(new Date());

            versionInfo.setUpdUsrId(optusername);
            versionService.update(versionInfo);
        }else{
            versionInfo.setCrtDt(new Date());

            versionInfo.setCrtUsrId(optusername);
            versionService.insert(versionInfo);
        }

        return "redirect:/versionController/index";
    }

    /**
     *删除
     * @param
     * @return
     */
    @RequestMapping(value = "/delete")
    public String delete(Integer id){
        Map<String,Object>map=new HashMap<String,Object>();
        map.put("lgcsn",id);
        versionService.delete(map);
        return "redirect:/versionController/index";
    }

    /**
     * 版本推送
     * @param
     * @return
     */

    @RequestMapping(value = "/send")
    @ResponseBody
    public String send(String vrsnSn,String upldLnk,String upldPwd,String group){

        Map<String,Object>map1=new HashMap<String,Object>();
        Map<String,Object>map2=new HashMap<String,Object>();
        Map<String,Object>map3=new HashMap<String,Object>();
        map1.put("is_to_all",false);
        map1.put("tag_id",group);
        map3.put("filter",map1);
        map2.put("content","您有新版本信息  版本号为："+vrsnSn+" 网盘下载地址为："+upldLnk+"  提取码："+upldPwd+"   请尽快提取下载更新！！！！！！/呲牙/呲牙/呲牙/呲牙");
        map3.put("text",map2);
        map3.put("msgtype","text");
        JSONObject jsonobject = new JSONObject(map3);
        String json = JSON.toJSONString(jsonobject);
        String result=HttpClientUtil.doPostSSL( "https://api.weixin.qq.com/cgi-bin/message/mass/sendall?access_token="+PublicConstant.accessToken,json);
        logger.info(result);

        JSONObject jo = JSONObject.parseObject(result);
        if("0".equals(jo.get("errcode").toString())){  //成功的

            return "发送成功";
        }else{
            //Map<String, Object> error = jo.getJSONObject("result");
            logger.info(jo.get("errcode").toString()+"-----"+jo.get("errmsg").toString());
            return "发送失败 失败信息"+jo.get("errmsg").toString();
        }
    }


    @RequestMapping(value = "/qy")
    public String qy(Integer lgcsn,String status){
        Map<String,Object>map=new HashMap<String,Object>();
        map.put("lgcsn",lgcsn);

        if("1".equals(status)){  //已经是启用了
            map.put("status","2");
            versionService.updatestatus(map);
        }
        if("2".equals(status)){  //未启用，启用这个 把其他的变未启用

            versionService.wqyversion(map);
            map.put("status","1");
            versionService.updatestatus(map);

        }

        return "redirect:/versionController/index";
    }
}
