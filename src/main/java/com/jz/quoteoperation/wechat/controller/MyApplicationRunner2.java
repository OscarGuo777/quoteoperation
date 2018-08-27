package com.jz.quoteoperation.wechat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class MyApplicationRunner2 implements ApplicationRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("后启动");
    }
}
