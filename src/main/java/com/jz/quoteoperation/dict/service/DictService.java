package com.jz.quoteoperation.dict.service;

import com.jz.quoteoperation.common.constant.CommonConstants;
import com.jz.quoteoperation.dict.bo.DictUserInfoBo;
import com.jz.quoteoperation.dict.bo.KVMap;
import com.jz.quoteoperation.dict.po.DictInfo;
import com.jz.quoteoperation.dict.po.DictInfoExample;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface DictService {
    @Cacheable(CommonConstants.DICT_CACHE)
    public List<DictInfo> selectDictAllByCode(String dictCode);
    @CachePut(value = CommonConstants.DICT_CACHE, key = "#result.dictCd")
    public DictInfo insert(DictInfo record);

    public List<DictUserInfoBo> selectDictUserInfo();

    public int updateByPrimaryKey(DictInfo dictInfo);

    public int deleteByExample(DictInfoExample dictInfoExample);
}
