package com.asiainfo.services.impl;

import com.asiainfo.dao.FunctionTreeMapper;
import com.asiainfo.entity.FunctionTree;
import com.asiainfo.enums.ResultEnum;
import com.asiainfo.exception.FunctionTreeException;
import com.asiainfo.services.FunctionTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者:wangkejie
 * 日期:2019-11-28
 * 时间:17:52
 */
@Service
public class FunctionTreeServiceImpl implements FunctionTreeService {

    @Autowired
    FunctionTreeMapper functionTreeMapper;

    @Override
    public List<FunctionTree> getFunctionTreeById(int id) {
        List<FunctionTree> list = functionTreeMapper.getFunctionTreeById(id);
        if(list.size()>0){
            throw new FunctionTreeException(ResultEnum.FUNCTION_TREE_ERROR);
        }
        return list;
    }

    @Override
    public List<FunctionTree> getAllFunctionTree() {
        return functionTreeMapper.getAllFunctionTree();
    }
}
