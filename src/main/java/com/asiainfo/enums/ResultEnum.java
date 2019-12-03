package com.asiainfo.enums;

/**
 * 作者:wangkejie
 * 日期:2019-12-02
 * 时间:16:48
 */
public enum ResultEnum {
    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(200,"成功"),
    FAIL(100,"失败"),
    FUNCTION_TREE_ERROR(10,"功能树获取失败")
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
