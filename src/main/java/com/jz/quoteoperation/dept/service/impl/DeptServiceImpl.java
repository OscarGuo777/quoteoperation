package com.jz.quoteoperation.dept.service.impl;

import com.jz.quoteoperation.dept.dao.DeptInfoMapper;
import com.jz.quoteoperation.dept.po.DeptInfo;
import com.jz.quoteoperation.dept.po.DeptInfoExample;
import com.jz.quoteoperation.dept.service.DeptService;
import com.jz.quoteoperation.user.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptInfoMapper deptInfoMapper;

    @Override
    public List<DeptInfo> selectByExample(DeptInfoExample example) {
        return deptInfoMapper.selectByExample(example);
    }

    @Override
    public int insert(DeptInfo deptInfo) {

        return deptInfoMapper.insert(deptInfo);
    }

    @Override
    public Long updateByPrimaryKey(DeptInfo deptInfo) {
        return deptInfoMapper.updateByPrimaryKey(deptInfo);
    }
}
