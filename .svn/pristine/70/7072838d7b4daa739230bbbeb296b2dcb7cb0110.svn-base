package com.jz.quoteoperation.replyself.dao;

import com.jz.quoteoperation.replyself.po.WechatReplySelf;
import com.jz.quoteoperation.replyself.po.WechatReplySelfExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WechatReplySelfMapper {
    long countByExample(WechatReplySelfExample example);

    List<WechatReplySelf>selectWechatReplySelfList(Map<String, Object> map);

    int deleteByExample(WechatReplySelfExample example);

    int insert(WechatReplySelf record);

    int update(WechatReplySelf record);
    void deletebyid(Map<String,Object>map);
    WechatReplySelf selectwechatReplySelf(Map<String,Object>map);

    WechatReplySelf wechatReplySelf(Map<String,Object>map);
    List<WechatReplySelf>checkkeyword(Map<String,Object>map);

    int insertSelective(WechatReplySelf record);

    List<WechatReplySelf> selectByExample(WechatReplySelfExample example);

    int updateByExampleSelective(@Param("record") WechatReplySelf record, @Param("example") WechatReplySelfExample example);

    int updateByExample(@Param("record") WechatReplySelf record, @Param("example") WechatReplySelfExample example);
}