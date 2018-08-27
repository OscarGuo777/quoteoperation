package com.jz.quoteoperation.user.dao;

import com.jz.quoteoperation.user.bo.UserDepartBO;
import com.jz.quoteoperation.user.bo.UserInfoBO;
import com.jz.quoteoperation.user.po.UserInfo;
import com.jz.quoteoperation.user.po.UserInfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /*List<UserInfoBO> queryUserAuth(Integer id);*/

    List<UserDepartBO> selectUserByKeyword(Map map);

    Long saveUser(Map map);

    public Long updateByPrimaryKey(UserInfo userInfo) ;

    List<UserDepartBO> queryAllUser();

    List<UserInfoBO> queryUserAuthByAcnt(@Param("usrAcnt")  String usrAcnt);
}