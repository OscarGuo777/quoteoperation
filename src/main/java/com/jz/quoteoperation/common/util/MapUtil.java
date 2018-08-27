package com.jz.quoteoperation.common.util;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * Created by Administrator on 2016/4/9.
 */
public class MapUtil {

    public static void appendToMap(Map map, String key, String value){
        appendToMap(map, key, value, ",");
    }

    public static void appendToMap(Map map, String key, String value, String seperator){
        if(StringUtils.isBlank(value)){
            return;
        }
        Object obj = map.get(key);
        if(obj == null){
            map.put(key, value);
        } else {
            map.put(key, obj.toString() + seperator + value);
        }
    }
}
