package com.zhiyou100.springboot03_mybatis.util;

/**
 * @author:@Rain
 * @date 2019/10/23 9:45
 * @desc
 */
public class ResultObject {

    private Integer code;
    private String msg;
    private Object obj;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public ResultObject() {
    }

    public ResultObject(Integer code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }
}
