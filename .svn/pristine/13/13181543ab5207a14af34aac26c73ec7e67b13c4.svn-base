package com.jz.quoteoperation.auth.controller;

import com.alibaba.fastjson.JSONArray;
import com.jz.quoteoperation.auth.bo.AuthUserBO;
import com.jz.quoteoperation.auth.po.AuthInfo;
import com.jz.quoteoperation.auth.po.AuthInfoExample;
import com.jz.quoteoperation.auth.service.AuthService;
import com.jz.quoteoperation.common.service.CommonService;
import com.jz.quoteoperation.user.bo.UserInfoBO;
import com.jz.quoteoperation.user.po.UserInfo;
import com.jz.quoteoperation.user.po.UserInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
@RequestMapping(value = "/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private CommonService commonService;

    @RequestMapping(value = "/toList")
    public String toList() {
        return "/auth/authList";
    }


    /**
     * 查询所有权限
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/queryAuth")
    public String queryAuth() {

        /*AuthInfoExample example = new AuthInfoExample();
        List<AuthInfo> authList = authService.selectByExample(example);*/

       List<AuthUserBO> authList =  authService.selectAuthUser();
        String json = JSONArray.toJSONString(authList);
        return json;
    }

    /**
     * 保存权限
     */
    @ResponseBody
    @RequestMapping(value = "/saveAuth", method = RequestMethod.POST)
    public Map saveAuth(String authNm,String status) {
        Map<String, String> map = new HashMap<String, String>();
        AuthInfo auth = new AuthInfo();
        auth.setAuthNm(authNm);
        auth.setStatus(status);
        auth.setCrtDt(new Date());
        UserInfoBO currentUser = commonService.getCurrentUser();
        auth.setCrtUsrId(currentUser.getLgcSn());
        int insert = authService.insert(auth);
        if(insert>0){
            map.put("state","true");
        }else{
            map.put("state", "false");
        }
        return map;
    }

    /**
     * 编辑权限
     * @param authname
     * @param status
     * @param lgcSn
     * @param model
     * @return
     */

    @ResponseBody
    @RequestMapping(value = "/editAuth",method = RequestMethod.POST)
    public Map editAuth(String authNm,String status,Integer lgcSn,Model model){
        Map<String, String> map = new HashMap<String,String>();
        AuthInfo authInfo = new AuthInfo();
        authInfo.setAuthNm(authNm);
        authInfo.setStatus(status);
        authInfo.setLgcSn(lgcSn);
        authInfo.setUpdDt(new Date());
        authInfo.setUpdUsrId(commonService.getCurrentUser().getLgcSn());
        Long update = authService.updateByPrimaryKey(authInfo);
        if(update>0){
            map.put("state", "true");
        }else{
            map.put("state", "false");
        }
        return map;
    }

    /**
     * 删除权限
     */

    @ResponseBody
    @RequestMapping(value = "/deleteAuth",method = RequestMethod.POST)
    public Map deleteAuth(Integer lgcSn){
        Map<String, String> map = new HashMap<String,String>();
        AuthInfoExample example = new AuthInfoExample();
        example.or().andLgcSnEqualTo(lgcSn);
        int delete = authService.deleteByExample(example);
        if (delete > 0) {
            map.put("state", "true");
        }else{
            map.put("state", "false");
        }
        return map;
    }
}
