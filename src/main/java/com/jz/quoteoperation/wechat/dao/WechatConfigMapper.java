package com.jz.quoteoperation.wechat.dao;

import com.jz.quoteoperation.wechat.po.WechatConfig;
import com.jz.quoteoperation.wechat.po.WechatConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatConfigMapper {
    long countByExample(WechatConfigExample example);

    int deleteByExample(WechatConfigExample example);

    int insert(WechatConfig record);
    int update(WechatConfig record);
    int insertSelective(WechatConfig record);

    List<WechatConfig> selectByExample(WechatConfigExample example);

    int updateByExampleSelective(@Param("record") WechatConfig record, @Param("example") WechatConfigExample example);

    int updateByExample(@Param("record") WechatConfig record, @Param("example") WechatConfigExample example);

    WechatConfig selectWechatConfig();
}