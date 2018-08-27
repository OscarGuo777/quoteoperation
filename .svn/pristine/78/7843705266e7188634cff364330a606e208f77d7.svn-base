package com.jz.quoteoperation.version.dao;

import com.jz.quoteoperation.version.po.VersionUseRecord;
import com.jz.quoteoperation.version.po.VersionUseRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VersionUseRecordMapper {
    long countByExample(VersionUseRecordExample example);

    int deleteByExample(VersionUseRecordExample example);

    int insert(VersionUseRecord record);

    int insertSelective(VersionUseRecord record);

    List<VersionUseRecord> selectByExample(VersionUseRecordExample example);

    int updateByExampleSelective(@Param("record") VersionUseRecord record, @Param("example") VersionUseRecordExample example);

    int updateByExample(@Param("record") VersionUseRecord record, @Param("example") VersionUseRecordExample example);
}