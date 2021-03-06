package com.jz.quoteoperation.auth.service.impl;

import com.jz.quoteoperation.auth.bo.AuthUserBO;
import com.jz.quoteoperation.auth.dao.AuthInfoMapper;
import com.jz.quoteoperation.auth.po.AuthInfo;
import com.jz.quoteoperation.auth.po.AuthInfoExample;
import com.jz.quoteoperation.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "authService")
public class AuthServiceImpl implements AuthService {
    @Autowired
    private AuthInfoMapper authInfoMapper;

    @Override
    public List<AuthInfo> selectByExample(AuthInfoExample example) {
        return authInfoMapper.selectByExample(example);
    }

    @Override
    public int insert(AuthInfo authInfo) {
        return authInfoMapper.insert(authInfo);
    }

    @Override
    public Long updateByPrimaryKey(AuthInfo authInfo) {
        return authInfoMapper.updateByPrimaryKey(authInfo);
    }

    @Override
    public int deleteByExample(AuthInfoExample example) {
        return authInfoMapper.deleteByExample(example);
    }

    @Override
    public List<AuthUserBO> selectAuthUser() {
        return authInfoMapper.selectAuthUser();
    }
}
