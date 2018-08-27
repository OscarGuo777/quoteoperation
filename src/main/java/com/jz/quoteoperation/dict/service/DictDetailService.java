package com.jz.quoteoperation.dict.service;

import com.jz.quoteoperation.dict.po.DictDetail;
import com.jz.quoteoperation.dict.po.DictDetailExample;

public interface DictDetailService {

    public int insertSelective(DictDetail dictDetail);

    public int insert(DictDetail dictDetail);

    public int updateByPrimaryKey(DictDetail dictDetail);

    public int deleteByExample(DictDetailExample example);
}
