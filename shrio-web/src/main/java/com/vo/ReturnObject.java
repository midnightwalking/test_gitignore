package com.vo;

/**
 * @author qiuzhi
 * @date 2018/11/15
 * @description
 */
public class ReturnObject {
    private String retCode;
    private String retMsg;
    private Object returnVal;

    public ReturnObject(String retCode, String retMsg) {
        this.retCode = retCode;
        this.retMsg = retMsg;
    }

    public ReturnObject(String retCode, String retMsg,Object returnVal) {
        this.retCode = retCode;
        this.retMsg = retMsg;
        this.returnVal = returnVal;
    }


    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public Object getReturnVal() {
        return returnVal;
    }

    public void setReturnVal(Object returnVal) {
        this.returnVal = returnVal;
    }

}
