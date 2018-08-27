package com.jz.quoteoperation.common.util;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Map;

public class CommonUtil {
	
	/**
	 * 判断List是否为空
	 * @param obj
	 * @return
	 */
	public static boolean isEmpty(List obj){
		if(obj == null || obj.isEmpty()){
			return true;
		}else{
			return false;
		}
	}

	public static boolean isEmpty(Map obj){
		if(obj == null || obj.isEmpty()){
			return true;
		}else{
			return false;
		}
	}

	public static boolean isEmpty(Object o) {
		if (o == null) {
			return true;
		}
		if (o instanceof String) {
			return StringUtil.isEmpty((String) o);
		}
		return false;
	}

}
