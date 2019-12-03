package com.asiainfo.controller;

import com.asiainfo.entity.FunctionTree;
import com.asiainfo.entity.Result;
import com.asiainfo.services.FunctionTreeService;
import com.asiainfo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 作者:wangkejie
 * 日期:2019-11-28
 * 时间:17:56
 */
@Controller
public class FunctionTreeController {

    @Autowired
    FunctionTreeService functionTreeService;


    @RequestMapping("/getFunctionTreeById")
    @ResponseBody
    public Result getFunctionTreeById(){
        List<FunctionTree> list = functionTreeService.getFunctionTreeById(Integer.valueOf(1001));
        return ResultUtil.success(list);
    }
}
