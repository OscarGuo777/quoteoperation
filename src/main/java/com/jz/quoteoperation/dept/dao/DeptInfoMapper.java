package com.jz.quoteoperation.dept.dao;

import com.jz.quoteoperation.dept.po.DeptInfo;
import com.jz.quoteoperation.dept.po.DeptInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptInfoMapper {
    long countByExample(DeptInfoExample example);

    int deleteByExample(DeptInfoExample example);

    int insert(DeptInfo record);

    int insertSelective(DeptInfo record);

    List<DeptInfo> selectByExample(DeptInfoExample example);

    int updateByExampleSelective(@Param("record") DeptInfo record, @Param("example") DeptInfoExample example);

    int updateByExample(@Param("record") DeptInfo record, @Param("example") DeptInfoExample example);

    Long updateByPrimaryKey(DeptInfo deptInfo);
}