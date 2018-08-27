package com.jz.quoteoperation.dict.controller;


import com.alibaba.fastjson.JSONArray;
import com.jz.quoteoperation.common.service.CommonService;
import com.jz.quoteoperation.dict.bo.DictUserInfoBo;
import com.jz.quoteoperation.dict.po.DictInfo;
import com.jz.quoteoperation.dict.po.DictInfoExample;
import com.jz.quoteoperation.dict.service.DictService;
import com.jz.quoteoperation.role.po.RoleInfo;
import com.jz.quoteoperation.role.po.RoleInfoExample;
import com.jz.quoteoperation.user.bo.UserInfoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "dict")
public class DictController {

    @Autowired
    private DictService dictService;

    @Autowired
    private CommonService commonService;


    @RequestMapping(value = "/toList")
    public String toList() {
        return "/dict/dictList";
    }

    /**
     * 查询字典项
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/queryDict")
    public String queryDict() {
        List<DictUserInfoBo> dictList = dictService.selectDictUserInfo();
        String json = JSONArray.toJSONString(dictList);
        return  json;
    }

    /**
     * 新增字典
     * @param platCd
     * @param roleName
     * @param status
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/saveDict", method = RequestMethod.POST)
    public Map saveDict(String dictCd, String dictName, String status) {
        Map<String, String> map = new HashMap<String, String>();
        DictInfo dictInfo = new DictInfo();
        dictInfo.setDictCd(dictCd);
        dictInfo.setDictNm(dictName);
        dictInfo.setStatus(status);
        UserInfoBO currentUser = commonService.getCurrentUser();
        dictInfo.setCrtDt(new Date());
        dictInfo.setCrtUsrId(currentUser.getLgcSn());
        final DictInfo insert = dictService.insert(dictInfo);
        map.put("state", "true");
        return map;
    }

    /**
     * 编辑角色
     * @param platCd
     * @param roleName
     * @param status
     * @param lgcSn
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/editDict",method = RequestMethod.POST)
    public Map editDict(String dictCd,String dictName,String status,Integer lgcSn){
        Map<String, String> map = new HashMap<String,String>();
        DictInfo dictInfo = new DictInfo();
        dictInfo.setDictCd(dictCd);
        dictInfo.setDictNm(dictName);
        dictInfo.setStatus(status);
        dictInfo.setLgcSn(lgcSn);
        dictInfo.setCrtDt(new Date());
        dictInfo.setCrtUsrId(commonService.getCurrentUser().getLgcSn());

        int update = dictService.updateByPrimaryKey(dictInfo);
        if(update>0){
            map.put("state", "true");
        }else{
            map.put("state", "false");
        }
        return map;
    }

    /**
     * 删除字典
     * @param lgcSn
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteDict",method = RequestMethod.POST)
    public Map deleteDict(Integer lgcSn){
        Map<String, String> map = new HashMap<String,String>();
        DictInfoExample example = new DictInfoExample();
        example.or().andLgcSnEqualTo(lgcSn);
        int delete = dictService.deleteByExample(example);
        if (delete > 0) {
            map.put("state", "true");
        }else{
            map.put("state", "false");
        }
        return map;
    }



}
