package com.jz.quoteoperation.publicinfo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jz.quoteoperation.common.atchinfo.po.AtchInfo;
import com.jz.quoteoperation.common.atchinfo.po.AtchInfoExample;
import com.jz.quoteoperation.common.atchinfo.po.AttachRlinInfo;
import com.jz.quoteoperation.common.atchinfo.po.AttachRlinInfoExample;
import com.jz.quoteoperation.common.atchinfo.service.AtchInfoService;
import com.jz.quoteoperation.common.atchinfo.service.AttachRlinInfoService;
import com.jz.quoteoperation.common.constant.CommonConstants;
import com.jz.quoteoperation.dict.bo.KVMap;
import com.jz.quoteoperation.dict.service.DictService;
import com.jz.quoteoperation.publicinfo.po.PublicInfo;
import com.jz.quoteoperation.publicinfo.po.PublicInfoExample;
import com.jz.quoteoperation.publicinfo.service.PublicinfoService;
import com.jz.quoteoperation.user.bo.UserInfoBO;
import com.jz.quoteoperation.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
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
 * @date 2018/8/17
 */

@Controller
@RequestMapping(value = "/publicinfo")
public class PublicinfoController {

    @Autowired
    PublicinfoService publicinfoService;
    @Autowired
    AtchInfoService atchInfoService;
    @Autowired
    AttachRlinInfoService attachRlinInfoService;
    @Autowired
    UserService userService;

    //跳转通告资料页面
    //publicinfotype 区分页面类型状态码 0:参考资料; 1:通知公告;
    @RequestMapping(value = "/tolist", produces = {"application/json;charset=UTF-8"})
    public String toList(String publicinfotype, Model model) {
        if (publicinfotype.equals("0")) {
            model.addAttribute("publicinfotype", "0");
            model.addAttribute("title", "参考资料");
            model.addAttribute("button", "上传资料");
        } else if (publicinfotype.equals("1")) {
            model.addAttribute("publicinfotype", "1");
            model.addAttribute("title", "通知公告");
            model.addAttribute("button", "发布公告");
        }
        return "/publicinfo/publicinfoList";
    }

    //跳转参考资料页面
    //publicinfotype 区分页面类型状态码 0:参考资料; 1:通知公告;
    @RequestMapping(value = "/toAdd", produces = {"application/json;charset=UTF-8"})
    public String toAdd(String publicinfotype, Model model) {
        if (publicinfotype.equals("0")) {
            model.addAttribute("publicinfotype", "0");
            model.addAttribute("title", "参考资料");
            model.addAttribute("button", "上传资料");
        } else if (publicinfotype.equals("1")) {
            model.addAttribute("publicinfotype", "1");
            model.addAttribute("title", "通知公告");
            model.addAttribute("button", "发布公告");
        }
        return "/publicinfo/publicinfoAdd";
    }

    //跳转查看详细界面方法
    //publicinfotype 区分页面类型状态码 0:参考资料; 1:通知公告;
    @ResponseBody
    @RequestMapping(value = "/toInformationlist", produces = {"application/json;charset=UTF-8"})
    public String toInformationList(String publicinfotype, Integer lgcSn, Model model) {
        String json = "";
        List jsonlist = new ArrayList();
        if (publicinfotype.equals("0")) {
            model.addAttribute("publicinfotype", "0");
            model.addAttribute("title", "参考资料");
            model.addAttribute("button", "上传资料");
        } else if (publicinfotype.equals("1")) {
            model.addAttribute("publicinfotype", "1");
            model.addAttribute("title", "通知公告");
            model.addAttribute("button", "发布公告");
        }
        //通告资料
        PublicInfoExample example = new PublicInfoExample();
        example.createCriteria().andLgcSnEqualTo(lgcSn);
        List<PublicInfo> list = publicinfoService.selectAll(example);
        //附件关联信息表
        AttachRlinInfoExample attachRlinInfoExample = new AttachRlinInfoExample();
        AttachRlinInfoExample.Criteria criteria = attachRlinInfoExample.createCriteria();
        criteria.andBsSnEqualTo(list.get(0).getLgcSn());
        criteria.andBsTpcdEqualTo(publicinfotype);
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
    //publicinfotype 区分页面类型状态码 0:参考资料; 1:通知公告;
    @ResponseBody
    @RequestMapping(value = "/query")
    public String findAll(String publicinfotype, String publicinfoquery1, String publicinfoquery2) {
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String json = "";
        try {
            Date date1 = format1.parse(publicinfoquery1);
            Date date2 = format1.parse(publicinfoquery2);

            Calendar date = Calendar.getInstance();
            date.setTime(date2);
            date.set(Calendar.DATE, date.get(Calendar.DATE) + 1);
            Date endDate2 = format1.parse(format1.format(date.getTime()));

            PublicInfoExample example = new PublicInfoExample();
            PublicInfoExample.Criteria criteria = example.createCriteria();
            criteria.andInfoTpcdEqualTo(publicinfotype);
            criteria.andCrtDtGreaterThanOrEqualTo(date1);
            criteria.andCrtDtLessThanOrEqualTo(endDate2);
            List<PublicInfo> list = publicinfoService.selectAll(example);
            json = JSONArray.toJSONString(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return json;
    }

    //保存
    //publicinfotype 区分页面类型状态码 0:参考资料; 1:通知公告;
    @ResponseBody
    @RequestMapping(value = "/addData")
    public Map addData(String publicinfotype, String atchInfos, String inforCntnt, String infotitle,
                       String authorities, String username) {
        Map rest = new HashMap();
        //获得用户信息
        List<UserInfoBO> UserInfoBO = userService.queryUserAuth(username);
        if(UserInfoBO.size()<0){
            rest.put("state", "false");
            return rest;
        }
        try {
            //通告资料
            PublicInfo publicInfo = new PublicInfo();
            publicInfo.setCrtDt(new Date());
            publicInfo.setCrtUsrId(UserInfoBO.get(0).getLgcSn());
            publicInfo.setInfoTpcd(publicinfotype);
            publicInfo.setInfoTitle(infotitle);
            publicInfo.setInfoCntnt(inforCntnt);
            publicinfoService.save(publicInfo);

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
                    attachRlinInfo.setBsSn(publicInfo.getLgcSn());
                    attachRlinInfo.setBsTpcd(publicinfotype);
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

}
