package com.liuping.common;

import org.json.JSONObject;

/**
 * Created by liuping on 15/12/9.
 */
public class ApiResult {

    private String code;

    private String message;

    private Object result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
