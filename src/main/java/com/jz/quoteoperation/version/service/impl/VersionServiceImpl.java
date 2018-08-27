package com.jz.quoteoperation.version.service.impl;

import com.jz.quoteoperation.version.dao.VersionInfoMapper;
import com.jz.quoteoperation.version.dao.VersionUseRecordMapper;
import com.jz.quoteoperation.version.po.VersionInfo;
import com.jz.quoteoperation.version.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service(value = "versionService")
public class VersionServiceImpl implements VersionService {

    @Autowired
    private VersionInfoMapper versionInfoMapper;

    @Autowired
    private VersionUseRecordMapper versionUseRecordMapper;


    @Override
    public void insert(VersionInfo versionInfo) {
        versionInfoMapper.insert(versionInfo);
    }

    @Override
    public void update(VersionInfo versionInfo) {
        versionInfoMapper.update(versionInfo);
    }

    @Override
    public void delete(Map<String, Object> map) {
        versionInfoMapper.delete(map);
    }

    @Override
    public List<VersionInfo> selectVersionInfoList(Map<String, Object> map) {
        return versionInfoMapper.selectVersionInfoList(map);
    }

    @Override
    public VersionInfo selecVersionInfo(Map<String, Object> map) {
        return versionInfoMapper.selecVersionInfo(map);
    }

    @Override
    public void updatestatus(Map<String, Object> map) {
        versionInfoMapper.updatestatus(map);
    }

    @Override
    public void wqyversion(Map<String, Object> map) {
        versionInfoMapper.wqyversion(map);
    }
}
