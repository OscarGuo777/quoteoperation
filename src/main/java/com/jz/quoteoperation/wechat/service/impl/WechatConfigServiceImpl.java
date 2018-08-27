package com.jz.quoteoperation.wechat.service.impl;

import com.jz.quoteoperation.wechat.dao.WechatConfigMapper;
import com.jz.quoteoperation.wechat.po.WechatConfig;
import com.jz.quoteoperation.wechat.service.WechatConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "wechatConfigService")
public class WechatConfigServiceImpl implements WechatConfigService {

    @Autowired
    private WechatConfigMapper wechatConfigMapper;

    @Override
    public WechatConfig selectWechatConfig() {
        return wechatConfigMapper.selectWechatConfig();
    }

    @Override
    public void insert(WechatConfig record) {
        wechatConfigMapper.insert(record);
    }

    @Override
    public void update(WechatConfig record) {
        wechatConfigMapper.update(record);
    }
}
