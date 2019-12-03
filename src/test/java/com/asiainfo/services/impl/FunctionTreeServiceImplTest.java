package com.asiainfo.services.impl;

import com.asiainfo.entity.FunctionTree;
import com.asiainfo.services.FunctionTreeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 作者:wangkejie
 * 日期:2019-11-28
 * 时间:17:54
 */

@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class FunctionTreeServiceImplTest {

    @Autowired
    FunctionTreeService functionTreeService;

    @Test
    public void getFunctionTreeById() {
        List<FunctionTree> functionTreeList =  functionTreeService.getFunctionTreeById(1001);
        System.out.println(functionTreeList);
    }

    @Test
    public void getAllFunctionTree() {
        List<FunctionTree> functionTreeList =  functionTreeService.getAllFunctionTree();
        System.out.println(functionTreeList);
    }
}