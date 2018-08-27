package com.jz.quoteoperation.role.service;

import com.jz.quoteoperation.role.bo.RoleUserBO;
import com.jz.quoteoperation.role.po.RoleInfo;
import com.jz.quoteoperation.role.po.RoleInfoExample;


import java.util.List;

public interface RoleService {

    public List<RoleInfo> selectByExample(RoleInfoExample example);

    public int insert(RoleInfo roleInfo);

    public int deleteByExample(RoleInfoExample example);

    public int updateByPrimaryKey(RoleInfo roleInfo);

    public List<RoleUserBO> selectRoleUser();
}
