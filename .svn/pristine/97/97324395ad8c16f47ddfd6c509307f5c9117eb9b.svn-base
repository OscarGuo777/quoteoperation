package com.jz.quoteoperation.demo.service.impl;

import com.jz.quoteoperation.demo.dao.DemoUserInfoMapper;
import com.jz.quoteoperation.demo.po.DemoUserInfo;
import com.jz.quoteoperation.demo.po.DemoUserInfoExample;
import com.jz.quoteoperation.demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "demoService")
public class DemoServiceImpl implements DemoService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DemoUserInfoMapper demoUserInfoMapper;

    @Override
    public List<DemoUserInfo> selectByExample(DemoUserInfoExample example) {
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
        return demoUserInfoMapper.selectByExample(example);
    }
}
