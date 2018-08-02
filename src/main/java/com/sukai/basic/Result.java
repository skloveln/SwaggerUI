package com.sukai.basic;

public class Result {

    private int code;
    private String message;
    private Object data;

    public Result(){
        this.code = Code.OK.getCode();
        this.message = Code.OK.getMessage();
    }

    public Result(Object data){
        this.code = Code.OK.getCode();
        this.message = Code.OK.getMessage();
        this.data = data;
    }

    public Result(Code code, Object data){
        this.code = code.getCode();
        this.message = code.getMessage();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
