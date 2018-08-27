package com.jz.quoteoperation.auth.service;

import com.jz.quoteoperation.auth.bo.AuthUserBO;
import com.jz.quoteoperation.auth.po.AuthInfo;
import com.jz.quoteoperation.auth.po.AuthInfoExample;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AuthService {

    public List<AuthInfo> selectByExample(AuthInfoExample example);

    public int insert(AuthInfo authInfo);

    public Long updateByPrimaryKey(AuthInfo authInfo);

    public int deleteByExample(AuthInfoExample example);

    public List<AuthUserBO> selectAuthUser();
}
