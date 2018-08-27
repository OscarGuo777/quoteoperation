package com.jz.quoteoperation.role.dao;

import com.jz.quoteoperation.role.bo.RoleUserBO;
import com.jz.quoteoperation.role.po.RoleInfo;
import com.jz.quoteoperation.role.po.RoleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleInfoMapper {
    long countByExample(RoleInfoExample example);

    int deleteByExample(RoleInfoExample example);

    int insert(RoleInfo record);

    int insertSelective(RoleInfo record);

    List<RoleInfo> selectByExample(RoleInfoExample example);

    int updateByExampleSelective(@Param("record") RoleInfo record, @Param("example") RoleInfoExample example);

    int updateByExample(@Param("record") RoleInfo record, @Param("example") RoleInfoExample example);

    int updateByPrimaryKey(RoleInfo roleInfo);

    List<RoleUserBO> selectRoleUser();
}