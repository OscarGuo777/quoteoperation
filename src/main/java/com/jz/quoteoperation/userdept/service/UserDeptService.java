package com.jz.quoteoperation.userdept.service;

import com.jz.quoteoperation.userdept.po.UserDept;

public interface UserDeptService {

    public int insert(UserDept userDept);

    public int updateByUserLgcSn(UserDept userDept);
}

