package com.jz.quoteoperation.security.controller;

import com.jz.quoteoperation.common.constant.CommonConstants;
import com.jz.quoteoperation.common.service.CommonService;
import com.jz.quoteoperation.demo.bo.Msg;
import com.jz.quoteoperation.dict.bo.KVMap;
import com.jz.quoteoperation.user.bo.UserInfoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private CommonService commonService;
    @RequestMapping("/")
    public String index(Model model) {
        List<KVMap> dictLst = commonService.getDictMapList(CommonConstants.IS_NO);
        UserInfoBO user = commonService.getCurrentUser();
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        model.addAttribute("dictLst",dictLst);
        return "index";
    }
    @RequestMapping("/demo1")
    public String demo1(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "demo1";
    }
    @RequestMapping("/demo2")
    public String demo2(Model model) {
        Msg msg = new Msg("测试标题222", "测试内容222", "额外信息，只对管理员显示2222");
        model.addAttribute("msg", msg);
        return "demo1";
    }
    @PreAuthorize("hasAuthority('ROLE_USER')")
    @RequestMapping(value="/admin/test1",method = RequestMethod.POST)
    @ResponseBody
    public String adminTest1() {
        return "ROLE_USER";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @RequestMapping("/admin/test2")
    @ResponseBody
    public String adminTest2() {
        return "ROLE_ADMIN";
    }
}
