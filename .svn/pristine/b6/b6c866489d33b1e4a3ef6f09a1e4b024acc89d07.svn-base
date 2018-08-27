package com.jz.quoteoperation.wechat.config;

import com.jz.quoteoperation.wechat.controller.MyApplicationRunner1;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这个是AccessToken 获取的定时配置
 */
@Configuration
public class AccessTokenQuartzConfig {
    @Bean
    public JobDetail accessTokenQuartzDetail(){
        return JobBuilder.newJob(MyApplicationRunner1.class).withIdentity("myApplicationRunner1").storeDurably().build();
    }

    @Bean
    public Trigger testQuartzTrigger(){
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(7200)  //设置时间周期单位秒7200秒获取一次
                .repeatForever();
        return TriggerBuilder.newTrigger().forJob(accessTokenQuartzDetail())
                .withIdentity("myApplicationRunner1")
                .withSchedule(scheduleBuilder)
                .build();
    }
}
