package com.jz.quoteoperation.dict.bo;

import java.io.Serializable;

/**
 * 存放dict单条明细
 */
public class KVMap implements Serializable {
    String code;
    String value;

    public KVMap(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KVMap{" +
                "code='" + code + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
