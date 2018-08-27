package com.jz.quoteoperation.common.atchinfo.service.impl;


import com.jz.quoteoperation.common.atchinfo.dao.AtchInfoMapper;
import com.jz.quoteoperation.common.atchinfo.po.AtchInfo;
import com.jz.quoteoperation.common.atchinfo.po.AtchInfoExample;
import com.jz.quoteoperation.common.atchinfo.service.AtchInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * 　　 ┏┓   ┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃       ┃
 * 　　┃   ━   ┃
 * 　　┃ ┳┛ ┗┳ ┃
 * 　　┃       ┃
 * 　　┃   ┻   ┃
 * 　　┃       ┃
 * 　　┗━┓   ┏━┛
 * 　　  ┃   ┃
 * 　　  ┃   ┃  　　
 * 　　  ┃   ┗━━━┓
 * 　　  ┃       ┣┓
 * 　　  ┃       ┏┛
 * 　　  ┗┓┓┏━┳┓┏┛
 * 　　   ┃┫┫ ┃┫┫
 * 　　   ┗┻┛ ┗┻┛
 * @author 张成
 * @date    2018/8/14
 */

@Service(value = "AtchInfoService")
public class AtchInfoServiceImpl implements AtchInfoService {

    @Autowired
    AtchInfoMapper atchInfoMapper;

    @Override
    public List<AtchInfo> select(AtchInfoExample atchInfoExample) {
        return atchInfoMapper.selectByExample(atchInfoExample);
    }

    @Override
    public void save(AtchInfo atchInfo) {
        atchInfoMapper.insert(atchInfo);
    }
}
