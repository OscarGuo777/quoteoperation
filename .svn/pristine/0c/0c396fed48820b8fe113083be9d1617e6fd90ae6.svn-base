package com.jz.quoteoperation.common.atchinfo.dao;

import com.jz.quoteoperation.common.atchinfo.po.AtchInfo;
import com.jz.quoteoperation.common.atchinfo.po.AtchInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface AtchInfoMapper {
    long countByExample(AtchInfoExample example);

    int deleteByExample(AtchInfoExample example);

    int insert(AtchInfo record);

    int insertSelective(AtchInfo record);

    List<AtchInfo> selectByExample(AtchInfoExample example);

    int updateByExampleSelective(@Param("record") AtchInfo record, @Param("example") AtchInfoExample example);

    int updateByExample(@Param("record") AtchInfo record, @Param("example") AtchInfoExample example);
}
