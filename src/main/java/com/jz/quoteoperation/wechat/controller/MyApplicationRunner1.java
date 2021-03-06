package com.jz.quoteoperation.wechat.controller;

import com.jz.quoteoperation.wechat.Feigninterface.FeignHttp;
import com.jz.quoteoperation.wechat.po.WechatConfig;
import com.jz.quoteoperation.wechat.service.WechatConfigService;
import com.jz.quoteoperation.wechat.service.impl.WechatConfigServiceImpl;
import com.jz.quoteoperation.wechat.util.HttpClientUtil;
import com.jz.quoteoperation.wechat.util.PublicConstant;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.LinkedHashMap;

@Component
@Order(value = 1)
public class MyApplicationRunner1 extends QuartzJobBean implements ApplicationRunner  {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private WechatConfigService wechatConfigService;

    @Autowired
    private FeignHttp feignHttp;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("先启动");

       // PublicConstant.accessToken=getAccessToken();
        logger.info("获取的access_token====="+PublicConstant.accessToken);
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("进入定时任务了----"+new Date());
        //PublicConstant.accessToken=getAccessToken();
        logger.info("定时任务获取的access_token====="+PublicConstant.accessToken);
    }

    /**
     * 获取 AccessToken方法
     * @return
     */
    public String getAccessToken(){
        WechatConfig wechatConfig=wechatConfigService.selectWechatConfig();
        String app_key = wechatConfig.getAppKey();
        String app_secret = wechatConfig.getAppSercet();
        String followWelcoming = wechatConfig.getFollowWelcoming();//欢迎语
        PublicConstant.followWelcoming=followWelcoming;
        Object o= feignHttp.getAccessToken("token",app_key,app_secret);
       /* String getaccess_tokenurl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + app_key + "&secret=" + app_secret;
        String res=HttpClientUtil.httpsRequestToString(getaccess_tokenurl,"get",null);*/
        LinkedHashMap map=(LinkedHashMap)o;

        return map.get("access_token").toString();
    }
}
