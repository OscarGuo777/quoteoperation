package com.jz.quoteoperation.version.service;

import com.jz.quoteoperation.version.po.VersionInfo;

import java.util.List;
import java.util.Map;

public interface VersionService {


    void insert(VersionInfo versionInfo);

    void update(VersionInfo versionInfo);

    void delete(Map<String,Object>map);
    List<VersionInfo> selectVersionInfoList(Map<String,Object>map);

    VersionInfo selecVersionInfo(Map<String,Object>map);
    void updatestatus(Map<String,Object>map);

    void wqyversion(Map<String,Object>map);
}
