package com.asiainfo.exception;

import com.asiainfo.enums.ResultEnum;

/**
 * 自定义异常处理类
 * 作者:wangkejie
 * 日期:2019-12-02
 * 时间:17:25
 */
public class FunctionTreeException extends RuntimeException {
    private Integer code;

    public FunctionTreeException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
