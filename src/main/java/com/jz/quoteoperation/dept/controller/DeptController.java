package com.jz.quoteoperation.dept.controller;

import com.jz.quoteoperation.dept.po.DeptInfo;
import com.jz.quoteoperation.dept.po.DeptInfoExample;
import com.jz.quoteoperation.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/depart")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/queryDepart", method = RequestMethod.GET)
    public String querydepart(Model model) {
        String str = null;
        DeptInfoExample example = new DeptInfoExample();
        List<DeptInfo> deptList = deptService.selectByExample(example);
        return str;
    }
}
