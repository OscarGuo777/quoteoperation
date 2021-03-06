package com.jz.quoteoperation.config;

import com.jz.quoteoperation.dict.bo.KVMap;
import com.jz.quoteoperation.dict.po.DictDetail;
import com.jz.quoteoperation.dict.po.DictInfo;
import com.jz.quoteoperation.dict.service.DictService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(value = 3)
public class InitializeConfiguration implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private DictService dictService;

    @Override
    public void run(String... args) throws Exception {
        List<DictInfo> list = dictService.selectDictAllByCode(null);//初始化数据字典；
        logger.info(" 数据字典初始化完成！ SIZE : "+list.size());
    }
}
