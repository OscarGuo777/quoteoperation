package com.jz.quoteoperation.replyself.service.impl;


import com.jz.quoteoperation.replyself.dao.WechatReplySelfMapper;
import com.jz.quoteoperation.replyself.po.WechatReplySelf;
import com.jz.quoteoperation.replyself.service.WechatReplySelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service(value = "wechatReplySelfService")
public class WechatReplySelfServiceImpl implements WechatReplySelfService {

    @Autowired
    private WechatReplySelfMapper wechatReplySelfMapper;


    @Override
    public List<WechatReplySelf> selectWechatReplySelfList(Map<String, Object> map) {
        return wechatReplySelfMapper.selectWechatReplySelfList(map);
    }

    @Override
    public void insert(WechatReplySelf record) {
        wechatReplySelfMapper.insert(record);
    }

    @Override
    public void update(WechatReplySelf record) {
        wechatReplySelfMapper.update(record);
    }

    @Override
    public void deletebyid(Map<String, Object> map) {
        wechatReplySelfMapper.deletebyid(map);
    }

    @Override
    public WechatReplySelf selectwechatReplySelf(Map<String,Object>map) {
        return wechatReplySelfMapper.selectwechatReplySelf(map);
    }

    @Override
    public WechatReplySelf wechatReplySelf(Map<String, Object> map) {
        return wechatReplySelfMapper.wechatReplySelf(map);
    }

    @Override
    public List<WechatReplySelf> checkkeyword(Map<String, Object> map) {
        return wechatReplySelfMapper.checkkeyword(map);
    }
}
