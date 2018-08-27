package com.jz.quoteoperation.login.controller;

import com.jz.quoteoperation.common.exception.BizException;
import com.jz.quoteoperation.common.service.CommonService;
import com.jz.quoteoperation.demo.bo.Msg;
import com.jz.quoteoperation.login.service.LoginService;
import com.jz.quoteoperation.user.po.UserInfo;
import com.jz.quoteoperation.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    private CommonService commonService;
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserService userService;

    @RequestMapping("/quit")
    public String logout(Model model) throws BizException {
        loginService.refreshCache();
        loginService.clearAuthentication();
        Msg msg = new Msg("","已注销!","");
        model.addAttribute("msg",msg);
        return "/login";
    }

    @RequestMapping("/userLogin")
    public String login(Model model) throws BizException {
        return "index";
    }

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/refreshCache")
    public String refreshCache(Model model) {
        loginService.refreshCache();
        return "index";
    }

    @RequestMapping("/register")
    public String register(UserInfo userInfo,String usrDept,Model model) throws BizException {
        userService.insertUserAndDept(userInfo,usrDept);
        Msg msg = new Msg("","注册成功!","");
        model.addAttribute("msg",msg);
        model.addAttribute("user",userInfo);
        return "login";
    }

    @RequestMapping("/demo1")
    public String demo1(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "demo1";
    }
}
