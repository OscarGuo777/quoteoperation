package com.jz.quoteoperation.demo.dao;

import com.jz.quoteoperation.demo.po.DemoUserInfo;
import com.jz.quoteoperation.demo.po.DemoUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemoUserInfoMapper {
    long countByExample(DemoUserInfoExample example);

    int deleteByExample(DemoUserInfoExample example);

    int insert(DemoUserInfo record);

    int insertSelective(DemoUserInfo record);

    List<DemoUserInfo> selectByExample(DemoUserInfoExample example);

    int updateByExampleSelective(@Param("record") DemoUserInfo record, @Param("example") DemoUserInfoExample example);

    int updateByExample(@Param("record") DemoUserInfo record, @Param("example") DemoUserInfoExample example);
}