package com.jz.quoteoperation.version.dao;

import com.jz.quoteoperation.version.po.VersionInfo;
import com.jz.quoteoperation.version.po.VersionInfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface VersionInfoMapper {
    long countByExample(VersionInfoExample example);

    int deleteByExample(VersionInfoExample example);


    void insert(VersionInfo versionInfo);

    void update(VersionInfo versionInfo);

    void delete(Map<String,Object>map);

    List<VersionInfo> selectVersionInfoList(Map<String,Object> map);

    void updatestatus(Map<String,Object>map);

    void wqyversion(Map<String,Object>map);

    VersionInfo selecVersionInfo(Map<String,Object>map);
    int insertSelective(VersionInfo record);

    List<VersionInfo> selectByExample(VersionInfoExample example);

    int updateByExampleSelective(@Param("record") VersionInfo record, @Param("example") VersionInfoExample example);

    int updateByExample(@Param("record") VersionInfo record, @Param("example") VersionInfoExample example);
}