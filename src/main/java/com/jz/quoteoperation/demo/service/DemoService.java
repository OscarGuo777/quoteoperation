package com.jz.quoteoperation.demo.service;

import com.jz.quoteoperation.demo.po.DemoUserInfo;
import com.jz.quoteoperation.demo.po.DemoUserInfoExample;

import java.util.List;

public interface DemoService {
    List<DemoUserInfo> selectByExample(DemoUserInfoExample example);
}
