package com.asiainfo.utils;

import com.asiainfo.entity.Result;
import com.asiainfo.enums.ResultEnum;

/**
 * 作者:wangkejie
 * 日期:2019-12-02
 * 时间:16:50
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(200);
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static Result fail(Object object){
        Result result = new Result();
        result.setCode(100);
        result.setMsg(ResultEnum.FAIL.getMsg());
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    //自定义异常回调使用该方法
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
