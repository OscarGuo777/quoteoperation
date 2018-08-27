package com.jz.quoteoperation.wechat.dao;

import com.jz.quoteoperation.wechat.po.WechatGroup;
import com.jz.quoteoperation.wechat.po.WechatGroupExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WechatGroupMapper {
    long countByExample(WechatGroupExample example);

    int deleteByExample(WechatGroupExample example);

    int insert(WechatGroup record);

    void update(WechatGroup wechatGroup);

    void delete(Map<String,Object> map);

    List<WechatGroup> selectWechatGroupList(Map<String,Object>map);

    WechatGroup selectWechatGroup(Map<String,Object>map);


    int insertSelective(WechatGroup record);

    List<WechatGroup> selectByExample(WechatGroupExample example);

    int updateByExampleSelective(@Param("record") WechatGroup record, @Param("example") WechatGroupExample example);

    int updateByExample(@Param("record") WechatGroup record, @Param("example") WechatGroupExample example);

    List<Map<String,Object>>selectuser(Map<String,Object> map);

    List<WechatGroup> selectWechatGroupAllList();

    void delusergroup(Map<String,Object> map);

    void saveusergroup(Map<String,Object> map);
}