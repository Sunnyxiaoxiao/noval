package com.asiainfo.services;

import com.asiainfo.entity.FunctionTree;

import java.util.List;

/**
 * 作者:wangkejie
 * 日期:2019-11-28
 * 时间:17:51
 */
public interface FunctionTreeService {
    List<FunctionTree> getFunctionTreeById(int id);

    List<FunctionTree> getAllFunctionTree();
}
