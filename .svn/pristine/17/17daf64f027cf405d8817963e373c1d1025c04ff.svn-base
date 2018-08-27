package com.jz.quoteoperation.publicinfo.dao;

import com.jz.quoteoperation.publicinfo.po.PublicInfo;
import com.jz.quoteoperation.publicinfo.po.PublicInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicInfoMapper {
    long countByExample(PublicInfoExample example);

    int deleteByExample(PublicInfoExample example);

    int insert(PublicInfo record);

    int insertSelective(PublicInfo record);

    List<PublicInfo> selectByExample(PublicInfoExample example);

    int updateByExampleSelective(@Param("record") PublicInfo record, @Param("example") PublicInfoExample example);

    int updateByExample(@Param("record") PublicInfo record, @Param("example") PublicInfoExample example);
}