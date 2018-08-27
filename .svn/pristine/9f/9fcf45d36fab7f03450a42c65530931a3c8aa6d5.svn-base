package com.jz.quoteoperation.demo.controller;

import com.jz.quoteoperation.demo.bo.Msg;
import com.jz.quoteoperation.demo.po.DemoUserInfo;
import com.jz.quoteoperation.demo.po.DemoUserInfoExample;
import com.jz.quoteoperation.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @ResponseBody
    @RequestMapping(value = "/queryDemo", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(){
        DemoUserInfoExample example = new DemoUserInfoExample();
        example.or().andStatusEqualTo("1");
        List<DemoUserInfo> list = demoService.selectByExample(example);
        return list;
    }

    @RequestMapping(value = "/login")
    public String index() {
        return "login2";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "index";
    }
    @PreAuthorize("hasAuthority('ROLE_USER')")
    @RequestMapping(value="/admintest1")
    @ResponseBody
    public String adminTest1() {
        return "ROLE_USER";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @RequestMapping("/admintest2")
    @ResponseBody
    public String adminTest2() {
        return "ROLE_ADMIN";
    }
}
