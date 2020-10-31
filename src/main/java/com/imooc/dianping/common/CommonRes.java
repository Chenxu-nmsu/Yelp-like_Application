package com.imooc.dianping.common;

public class CommonRes {

    // success or fail
    private String status;

    // status = success, return json
    // status = fail, return error
    private Object data;

    // 定义
    public static CommonRes create(Object result){

        return CommonRes.create(result, "success");
    }

    public static CommonRes create(Object result,String status){
        CommonRes commonRes = new CommonRes();
        commonRes.setStatus(status);
        commonRes.setData(result);

        return commonRes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
