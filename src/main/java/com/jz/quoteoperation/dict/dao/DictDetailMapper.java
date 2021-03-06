package com.jz.quoteoperation.dict.dao;

import com.jz.quoteoperation.dict.po.DictDetail;
import com.jz.quoteoperation.dict.po.DictDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictDetailMapper {
    long countByExample(DictDetailExample example);

    int deleteByExample(DictDetailExample example);

    int insert(DictDetail record);

    int insertSelective(DictDetail record);

    List<DictDetail> selectByExample(DictDetailExample example);

    int updateByExampleSelective(@Param("record") DictDetail record, @Param("example") DictDetailExample example);

    int updateByExample(@Param("record") DictDetail record, @Param("example") DictDetailExample example);

    int updateByPrimaryKey(DictDetail dictDetail);
}