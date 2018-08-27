package com.jz.quoteoperation.role.service.impl;

import com.jz.quoteoperation.role.bo.RoleUserBO;
import com.jz.quoteoperation.role.dao.RoleInfoMapper;
import com.jz.quoteoperation.role.po.RoleInfo;
import com.jz.quoteoperation.role.po.RoleInfoExample;
import com.jz.quoteoperation.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleInfoMapper roleInfoMapper;

    @Override
    public List<RoleInfo> selectByExample(RoleInfoExample example) {
        return roleInfoMapper.selectByExample(example);
    }

    @Override
    public int insert(RoleInfo roleInfo) {
        return roleInfoMapper.insert(roleInfo);
    }

    @Override
    public int deleteByExample(RoleInfoExample example) {
        return roleInfoMapper.deleteByExample(example);
    }

    @Override
    public int updateByPrimaryKey(RoleInfo roleInfo) {
        return roleInfoMapper.updateByPrimaryKey(roleInfo);
    }

    @Override
    public List<RoleUserBO> selectRoleUser() {
        return roleInfoMapper.selectRoleUser();
    }
}
