package com.jz.quoteoperation.common.atchinfo.service.impl;


import com.jz.quoteoperation.common.atchinfo.dao.AttachRlinInfoMapper;
import com.jz.quoteoperation.common.atchinfo.po.AttachRlinInfo;
import com.jz.quoteoperation.common.atchinfo.po.AttachRlinInfoExample;
import com.jz.quoteoperation.common.atchinfo.service.AttachRlinInfoService;
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


@Service(value = "AttachRlinInfoService")
public class AttachRlinInfoServiceImpl implements AttachRlinInfoService {

    @Autowired
    AttachRlinInfoMapper attachRlinInfoMapper;

    @Override
    public List<AttachRlinInfo> select(AttachRlinInfoExample example) {
        return attachRlinInfoMapper.selectByExample(example);
    }

    @Override
    public void save(AttachRlinInfo attachRlinInfo) {
        attachRlinInfoMapper.insert(attachRlinInfo);
    }
}
