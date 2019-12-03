package com.asiainfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者:wangkejie
 * 日期:2019-11-28
 * 时间:15:09
 */
@Controller
public class test {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
