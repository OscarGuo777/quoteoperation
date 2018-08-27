package com.jz.quoteoperation.auth.dao;

import com.jz.quoteoperation.auth.bo.AuthUserBO;
import com.jz.quoteoperation.auth.po.AuthInfo;
import com.jz.quoteoperation.auth.po.AuthInfoExample;
import java.util.List;

import com.jz.quoteoperation.user.po.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface AuthInfoMapper {
    long countByExample(AuthInfoExample example);

    int deleteByExample(AuthInfoExample example);

    int insert(AuthInfo record);

    int insertSelective(AuthInfo record);

    List<AuthInfo> selectByExample(AuthInfoExample example);

    int updateByExampleSelective(@Param("record") AuthInfo record, @Param("example") AuthInfoExample example);

    int updateByExample(@Param("record") AuthInfo record, @Param("example") AuthInfoExample example);

    Long updateByPrimaryKey(AuthInfo authInfo);

    List<AuthUserBO> selectAuthUser();
}