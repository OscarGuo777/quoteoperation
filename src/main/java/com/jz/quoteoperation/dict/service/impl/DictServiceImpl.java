package com.jz.quoteoperation.dict.service.impl;

import com.jz.quoteoperation.dict.bo.DictUserInfoBo;
import com.jz.quoteoperation.dict.bo.KVMap;
import com.jz.quoteoperation.dict.dao.DictInfoMapper;
import com.jz.quoteoperation.dict.po.DictDetail;
import com.jz.quoteoperation.dict.po.DictInfo;
import com.jz.quoteoperation.dict.po.DictInfoExample;
import com.jz.quoteoperation.dict.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "dictService")
public class DictServiceImpl implements DictService {
    @Autowired
    private DictInfoMapper dictInfoMapper;

    @Override
    public List<DictInfo> selectDictAllByCode(String dictCode) {
        List<DictInfo> list = dictInfoMapper.selectDictAllByCode(dictCode);//初始化数据字典；
        return list;
    }

    @Override
    public DictInfo insert(DictInfo record) {
        dictInfoMapper.insert(record);
        return record;
    }

    @Override
    public List<DictUserInfoBo> selectDictUserInfo() {
        return dictInfoMapper.selectDictUserInfo();
    }

    @Override
    public int updateByPrimaryKey(DictInfo dictInfo) {
        return dictInfoMapper.updateByPrimaryKey(dictInfo);
    }

    @Override
    public int deleteByExample(DictInfoExample dictInfoExample) {
        return dictInfoMapper.deleteByExample(dictInfoExample);
    }
}
