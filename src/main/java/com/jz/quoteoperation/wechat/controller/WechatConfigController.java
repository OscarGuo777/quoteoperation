package com.jz.quoteoperation.wechat.controller;

import com.jz.quoteoperation.wechat.po.WechatConfig;
import com.jz.quoteoperation.wechat.service.WechatConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/wechatConfigController")
public class WechatConfigController {

    @Autowired
    private WechatConfigService wechatConfigService;

    @RequestMapping(value = "/index")
    public String index(ModelMap map) {

        WechatConfig wechatconfig=wechatConfigService.selectWechatConfig();
        if(wechatconfig!=null){
            map.put("lgcSn", wechatconfig.getLgcSn());
            map.put("appKey", wechatconfig.getAppKey());
            map.put("appSercet", wechatconfig.getAppSercet());
            map.put("followWelcoming", wechatconfig.getFollowWelcoming()); //关注时触发欢迎语并发送
        }else{
            map.put("lgcSn", "");
            map.put("appKey", "");
            map.put("appSercet", "");
            map.put("followWelcoming", "");
        }

        return "/wechatconfig/wechat_config.html";
    }
    @RequestMapping(value = "/saveorupdate")
    public String saveorupdate(WechatConfig wechatconfig){

        Integer lgcSn=wechatconfig.getLgcSn();
        if(lgcSn!=null){  // 更新
            wechatConfigService.update(wechatconfig);
        }else{ // 新增
            wechatConfigService.insert(wechatconfig);
        }
        return "redirect:/wechatConfigController/index";
    }
}
