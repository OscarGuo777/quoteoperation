package com.jz.quoteoperation.userdept.service.impl;

import com.jz.quoteoperation.userdept.dao.UserDeptMapper;
import com.jz.quoteoperation.userdept.po.UserDept;
import com.jz.quoteoperation.userdept.service.UserDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userDeptService")
public class UserDeptServiceImpl implements UserDeptService {
    @Autowired
    private UserDeptMapper userDeptMapper;

    @Override
    public int insert(UserDept userDept) {
        return userDeptMapper.insert(userDept);
    }

    @Override
    public int updateByUserLgcSn(UserDept userDept) {
        return userDeptMapper.updateByUserLgcSn(userDept);
    }
}
