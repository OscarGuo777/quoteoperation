package com.jz.quoteoperation.wechat.Feigninterface;


import com.alibaba.fastjson.JSONObject;
import com.jz.quoteoperation.wechat.util.PublicConstant;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.websocket.server.PathParam;

@Headers("Content-Type: application/json")
@Service
public interface FeignHttp {



    @RequestLine("GET /cgi-bin/{token}?grant_type=client_credential&appid={app_key}&secret={app_secret}")
    public Object  getAccessToken(@Param("token") String token,@Param("app_key") String app_key, @Param("app_secret") String app_secret);


    /*@RequestLine("POST /cgi-bin/groups/{url}")
    public Object saveGroup(@RequestHeader(value="url") String url);*/
}
