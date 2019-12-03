package com.asiainfo.handler;

import com.asiainfo.entity.Result;
import com.asiainfo.enums.ResultEnum;
import com.asiainfo.exception.FunctionTreeException;
import com.asiainfo.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作者:wangkejie
 * 日期:2019-12-02
 * 时间:17:34
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof FunctionTreeException){
            FunctionTreeException functionTreeException = (FunctionTreeException)e;
            return ResultUtil.error(functionTreeException.getCode(),functionTreeException.getMessage());
        }else {
            logger.error("【系统异常】{}",e);
            return ResultUtil.error(ResultEnum.UNKONW_ERROR.getCode(), ResultEnum.UNKONW_ERROR.getMsg());
        }
    }
}
