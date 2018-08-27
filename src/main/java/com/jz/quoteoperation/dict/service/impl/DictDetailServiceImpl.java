package com.jz.quoteoperation.dict.service.impl;

import com.jz.quoteoperation.dict.dao.DictDetailMapper;
import com.jz.quoteoperation.dict.po.DictDetail;
import com.jz.quoteoperation.dict.po.DictDetailExample;
import com.jz.quoteoperation.dict.service.DictDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "dictDetailService")
public class DictDetailServiceImpl implements DictDetailService {

    @Autowired
    private DictDetailMapper dictDetailMapper;
    @Override
    public int insertSelective(DictDetail dictDetail) {
        return dictDetailMapper.insertSelective(dictDetail);
    }

    @Override
    public int insert(DictDetail dictDetail) {
        return dictDetailMapper.insert(dictDetail);
    }

    @Override
    public int updateByPrimaryKey(DictDetail dictDetail) {
        return dictDetailMapper.updateByPrimaryKey(dictDetail);
    }

    @Override
    public int deleteByExample(DictDetailExample example) {
        return dictDetailMapper.deleteByExample(example);
    }
}
