package com.jz.quoteoperation.wechat.service.impl;

import com.jz.quoteoperation.wechat.dao.WechatGroupMapper;
import com.jz.quoteoperation.wechat.po.WechatGroup;
import com.jz.quoteoperation.wechat.service.WechatGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service(value = "WechatGroupService")
public class WechatGroupServiceImpl implements WechatGroupService {

    @Autowired
    private WechatGroupMapper wechatGroupMapper;


    @Override
    public void insert(WechatGroup wechatGroup) {
        wechatGroupMapper.insert(wechatGroup);
    }

    @Override
    public void update(WechatGroup wechatGroup) {
        wechatGroupMapper.update(wechatGroup);
    }

    @Override
    public void delete(Map<String, Object> map) {
        wechatGroupMapper.delete(map);
    }

    @Override
    public List<WechatGroup> selectWechatGroupList(Map<String, Object> map) {
        return wechatGroupMapper.selectWechatGroupList(map);
    }

    @Override
    public List<WechatGroup> selectWechatGroupAllList() {
        return wechatGroupMapper.selectWechatGroupAllList();
    }

    @Override
    public WechatGroup selectWechatGroup(Map<String, Object> map) {
        return wechatGroupMapper.selectWechatGroup(map);
    }

    @Override
    public List<Map<String,Object>> selectuser(Map<String, Object> map) {
        return wechatGroupMapper.selectuser(map);
    }

    @Override
    public void delusergroup(Map<String, Object> map) {
        wechatGroupMapper.delusergroup(map);
    }

    @Override
    public void saveusergroup(Map<String, Object> map) {
        wechatGroupMapper.saveusergroup(map);
    }
}
