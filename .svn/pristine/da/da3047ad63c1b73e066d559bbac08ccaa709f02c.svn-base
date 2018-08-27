package com.jz.quoteoperation.publicinfo.service.impl;


import com.jz.quoteoperation.publicinfo.dao.PublicInfoMapper;
import com.jz.quoteoperation.publicinfo.po.PublicInfo;
import com.jz.quoteoperation.publicinfo.po.PublicInfoExample;
import com.jz.quoteoperation.publicinfo.service.PublicinfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
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
 *
 * @author 张成
 * @date 2018/8/17
 */

@Service(value = "PublicinfoService")
public class PublicinfoServiceImpl implements PublicinfoService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    PublicInfoMapper publicInfoMapper;

    @Override
    public List<PublicInfo> selectAll(PublicInfoExample example) {
        return publicInfoMapper.selectByExample(example);
    }

    @Override
    public void save(PublicInfo publicInfo) {
        publicInfoMapper.insert(publicInfo);
    }
}
