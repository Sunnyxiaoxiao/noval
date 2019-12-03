package com.asiainfo.entity;

import lombok.Data;

/**
 * 作者:wangkejie
 * 日期:2019-11-28
 * 时间:16:04
 */
@Data
public class FunctionTree {
    private Integer id;
    private Integer pid;
    private String name;
    private Integer parent;
    private String state;
    private String url;
}
