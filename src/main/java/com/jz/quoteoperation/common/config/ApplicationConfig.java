package com.jz.quoteoperation.common.config;

import org.springframework.stereotype.Controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ApplicationConfig implements Serializable {

	private static ApplicationConfig instance;

	public ApplicationConfig() {
		instance = this;
	}

	private Map config = new HashMap();

	public static ApplicationConfig getInstance() {
		return instance;
	}
	
	public String getStringProperty(Object key) {
		return (String) config.get(key);
	}

	public Integer getIntProperty(Object key) {
		return (Integer) config.get(key);
	}

	public Map getConfig() {
		return config;
	}

	public void setConfig(Map config) {
		this.config = config;
	}

	public boolean isDevEnv() {
		return "dev".equals(getStringProperty("env"));
	}

	public String getTmpDir() {
		return getStringProperty("tmpDir");
	}
}
