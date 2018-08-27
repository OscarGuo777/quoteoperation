package com.jz.quoteoperation.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ck
 * @date 2016/3/16
 */
public class BeanUtil {

    public static Map<String, Object> transBean2Map(Object obj) {

        if(obj == null){
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();

                // 过滤class属性
                if (!key.equals("class")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(obj);

                    map.put(key, value);
                }

            }
        } catch (Exception e) {
            System.out.println("transBean2Map Error " + e);
        }

        return map;

    }


    /**
     * JSON字符串转换成对应的对象
     * @param jsons
     * @param clazz
     * @return T
     */
    public static <T> T jsonToObject(String jsons,Class<T> clazz){
        try{
            if(StringUtils.isEmpty(jsons)){
                return null;
            }
            ObjectMapper objectMapper = new ObjectMapper();
            return  objectMapper.readValue(jsons,clazz);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Object 转 Json 串
     * @param obj
     * @return
     */
    public static String objectToJson(Object obj){
        try{
            if(obj==null){
                return "";
            }
            ObjectMapper objectMapper = new ObjectMapper();
            return  objectMapper.writeValueAsString(obj);
        }catch(Exception e){
            e.printStackTrace();
            return "";
        }

    }
}
