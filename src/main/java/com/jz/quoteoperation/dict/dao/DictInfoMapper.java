package com.jz.quoteoperation.dict.dao;

import com.jz.quoteoperation.dict.bo.DictUserInfoBo;
import com.jz.quoteoperation.dict.po.DictInfo;
import com.jz.quoteoperation.dict.po.DictInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictInfoMapper {
    long countByExample(DictInfoExample example);

    int deleteByExample(DictInfoExample example);

    int insert(DictInfo record);

    int insertSelective(DictInfo record);

    List<DictInfo> selectByExample(DictInfoExample example);

    int updateByExampleSelective(@Param("record") DictInfo record, @Param("example") DictInfoExample example);

    int updateByExample(@Param("record") DictInfo record, @Param("example") DictInfoExample example);

    List<DictInfo> selectDictAllByCode(@Param("dictCode") String dictCode);

    List<DictUserInfoBo> selectDictUserInfo();

    int updateByPrimaryKey(DictInfo dictInfo);

}