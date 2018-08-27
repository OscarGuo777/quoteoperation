package com.jz.quoteoperation.replyself.service;

import com.jz.quoteoperation.replyself.po.WechatReplySelf;

import java.util.List;
import java.util.Map;

public interface WechatReplySelfService {

    List<WechatReplySelf> selectWechatReplySelfList(Map<String,Object>map);

    void insert(WechatReplySelf record);

    void update(WechatReplySelf record);

    void deletebyid(Map<String,Object>map);
    WechatReplySelf selectwechatReplySelf(Map<String,Object>map);

    /**
     * 按关键字完全匹配   你给微信发信息 匹配上了 微信回你一条信息
     * @param map
     * @return
     */
    WechatReplySelf wechatReplySelf(Map<String,Object>map);

    /**
     * 校验关键字是否重复
     * @param map
     * @return
     */
    List<WechatReplySelf>checkkeyword(Map<String,Object>map);
}
