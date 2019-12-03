package com.asiainfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 作者:wangkejie
 * 日期:2019-11-28
 * 时间:15:03
 */
@SpringBootApplication
@EnableAutoConfiguration
public class NovalApplication {
    public static void main(String[] args) {
        SpringApplication.run(NovalApplication.class,args);
    }
}
