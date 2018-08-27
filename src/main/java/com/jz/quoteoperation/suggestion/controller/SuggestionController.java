package com.jz.quoteoperation.suggestion.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jz.quoteoperation.common.atchinfo.po.AtchInfo;
import com.jz.quoteoperation.common.atchinfo.po.AtchInfoExample;
import com.jz.quoteoperation.common.atchinfo.po.AttachRlinInfo;
import com.jz.quoteoperation.common.atchinfo.po.AttachRlinInfoExample;
import com.jz.quoteoperation.common.atchinfo.service.AtchInfoService;
import com.jz.quoteoperation.common.atchinfo.service.AttachRlinInfoService;
import com.jz.quoteoperation.suggestion.po.Suggestion;
import com.jz.quoteoperation.suggestion.po.SuggestionExample;
import com.jz.quoteoperation.suggestion.service.SuggestionService;
import com.jz.quoteoperation.user.bo.UserInfoBO;
import com.jz.quoteoperation.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

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
 * @date 2018/8/14
 */


@Controller
@RequestMapping(value = "/suggestion")
public class SuggestionController {

    @Autowired
    SuggestionService suggestionService;
    @Autowired
    AtchInfoService atchInfoService;
    @Autowired
    AttachRlinInfoService attachRlinInfoService;
    @Autowired
    UserService userService;

    //跳转问题反馈页面
    //suggestiontype 区分页面类型状态码 0:问题反馈; 1:功能定制;
    @RequestMapping(value = "/tolist", produces = {"application/json;charset=UTF-8"})
    public String toList(String suggestiontype, Model model) {
        if (suggestiontype.equals("0")) {
            model.addAttribute("suggestiontype", "0");
            model.addAttribute("title", "问题反馈");
            model.addAttribute("button", "我要反馈");
        } else if (suggestiontype.equals("1")) {
            model.addAttribute("suggestiontype", "1");
            model.addAttribute("title", "功能定制");
            model.addAttribute("button", "我要定制");
        }
        return "/suggestion/suggestionList";
    }

    //跳转问题反馈页面
    //suggestiontype 区分页面类型状态码 0:问题反馈; 1:功能定制;
    @RequestMapping(value = "/toAdd", produces = {"application/json;charset=UTF-8"})
    public String toAdd(String suggestiontype, Model model) {
        if (suggestiontype.equals("0")) {
            model.addAttribute("suggestiontype", "0");
            model.addAttribute("title", "问题反馈");
            model.addAttribute("button", "我要反馈");
        } else if (suggestiontype.equals("1")) {
            model.addAttribute("suggestiontype", "1");
            model.addAttribute("title", "功能定制");
            model.addAttribute("button", "我要定制");
        }
        return "/suggestion/suggestionAdd";
    }

    //跳转查看详细界面方法
    //suggestiontype 区分页面类型状态码 0:问题反馈; 1:功能定制;
    @ResponseBody
    @RequestMapping(value = "/toInformationlist", produces = {"application/json;charset=UTF-8"})
    public String toInformationList(String suggestiontype, Integer lgcSn, Model model) {
        String json = "";
        List jsonlist = new ArrayList();
        if (suggestiontype.equals("0")) {
            model.addAttribute("suggestiontype", "0");
            model.addAttribute("title", "问题反馈");
            model.addAttribute("button", "我要反馈");
        } else if (suggestiontype.equals("1")) {
            model.addAttribute("suggestiontype", "1");
            model.addAttribute("title", "功能定制");
            model.addAttribute("button", "我要定制");
        }
        //个人建议与功能定制
        SuggestionExample example = new SuggestionExample();
        example.createCriteria().andLgcSnEqualTo(lgcSn);
        List<Suggestion> list = suggestionService.selectAll(example);
        //附件关联信息表
        AttachRlinInfoExample attachRlinInfoExample = new AttachRlinInfoExample();
        AttachRlinInfoExample.Criteria criteria = attachRlinInfoExample.createCriteria();
        criteria.andBsSnEqualTo(list.get(0).getLgcSn());
        criteria.andBsTpcdEqualTo(suggestiontype);
        List<AttachRlinInfo> attachRlinInfos = attachRlinInfoService.select(attachRlinInfoExample);
        //附件信息表
        List<AtchInfo> list1 = new ArrayList<>();
        for (int i = 0; i < attachRlinInfos.size(); i++) {
            AtchInfoExample atchInfoExample = new AtchInfoExample();
            atchInfoExample.createCriteria().andLgcSnEqualTo(attachRlinInfos.get(i).getAtchSn());
            List<AtchInfo> atchInfos1 = atchInfoService.select(atchInfoExample);
            list1.add(atchInfos1.get(0));
        }
        jsonlist.add(list);
        jsonlist.add(list1);
        json = JSONArray.toJSONString(jsonlist);

        return json;
    }

    //带时间区间的查询
    //suggestiontype 区分页面类型状态码 0:问题反馈; 1:功能定制;
    @ResponseBody
    @RequestMapping(value = "/query")
    public String findAll(String suggestiontype, String suggestionquery1, String suggestionquery2) {
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String json = "";
        try {
            Date date1 = format1.parse(suggestionquery1);
            Date date2 = format1.parse(suggestionquery2);

            Calendar date = Calendar.getInstance();
            date.setTime(date2);
            date.set(Calendar.DATE, date.get(Calendar.DATE) + 1);
            Date endDate2 = format1.parse(format1.format(date.getTime()));

            SuggestionExample example = new SuggestionExample();
            SuggestionExample.Criteria criteria = example.createCriteria();
            criteria.andSgtnTpcdEqualTo(suggestiontype);
            criteria.andCrtDtGreaterThanOrEqualTo(date1);
            criteria.andCrtDtLessThanOrEqualTo(endDate2);
            List<Suggestion> list = suggestionService.selectAll(example);
            json = JSONArray.toJSONString(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return json;
    }

    //保存
    @ResponseBody
    @RequestMapping(value = "/addData")
    public Map addData(String suggestiontype, String atchInfos, String sginCntnt,
                       String authorities, String username) {
        Map rest = new HashMap();
        //获得用户信息
        List<UserInfoBO> UserInfoBO = userService.queryUserAuth(username);
        if (UserInfoBO.size()<0) {
            rest.put("state", "false");
            return rest;
        }
        try {
            //个人建议与功能定制
            Suggestion suggestion = new Suggestion();
            suggestion.setSgtnUsrId(UserInfoBO.get(0).getLgcSn());
            suggestion.setSgtnTpcd(suggestiontype);
            suggestion.setSgtnCntnt(sginCntnt);
            suggestion.setCrtDt(new Date());
            suggestion.setRplyDt(new Date());
            suggestionService.save(suggestion);
            //图片信息
            JSONObject json = new JSONObject();
            if (atchInfos != null && atchInfos != "") {
                json = JSON.parseObject(atchInfos);
            }
            if (json != null) {
                for (int i = 0; i < json.size(); i++) {
                    //附件信息表
                    AtchInfo atchInfo = new AtchInfo();
                    JSONObject info = JSON.parseObject(json.getString(String.valueOf(i + 1)));
                    atchInfo.setAtchNm(info.getString("fileName") == null ?
                            "" : info.getString("fileName"));
                    atchInfo.setAtchPath(info.getString("filePath") == null ?
                            "" : info.getString("filePath"));
                    atchInfoService.save(atchInfo);
                    //附件关联信息表
                    AttachRlinInfo attachRlinInfo = new AttachRlinInfo();
                    attachRlinInfo.setAtchSn(atchInfo.getLgcSn());
                    attachRlinInfo.setBsSn(suggestion.getLgcSn());
                    attachRlinInfo.setBsTpcd(suggestiontype);
                    attachRlinInfo.setCrtDt(new Date());
                    attachRlinInfo.setCrtUsrId(UserInfoBO.get(0).getLgcSn());
                    attachRlinInfoService.save(attachRlinInfo);
                }
            }


            rest.put("state", "true");
        } catch (Exception E) {
            rest.put("state", "false");
        }

        return rest;
    }

    //保存
    @ResponseBody
    @RequestMapping(value = "/addhfdata")
    public Map addhfdata(Integer lgcSn, String username, String rplyCntnt) {
        Map rest = new HashMap();
        //获得用户信息
        List<UserInfoBO> UserInfoBO = userService.queryUserAuth(username);
        if (UserInfoBO.size()<0) {
            rest.put("state", "false");
            return rest;
        }
        try {
            SuggestionExample example = new SuggestionExample();
            SuggestionExample.Criteria criteria = example.createCriteria();
            criteria.andLgcSnEqualTo(lgcSn);
            List<Suggestion> list = suggestionService.selectAll(example);
            Suggestion suggestion = list.get(0);
            suggestion.setRplyDt(new Date());
            suggestion.setRplyCntnt(rplyCntnt);
            suggestion.setRplyUsrId(UserInfoBO.get(0).getLgcSn());

            suggestionService.update(suggestion,example);
            rest.put("state", "true");
        } catch (Exception E) {
            rest.put("state", "false");
        }
        return rest;
    }
}

