package com.asiainfo.dao;

import com.asiainfo.entity.FunctionTree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * 作者:wangkejie
 * 日期:2019-11-28
 * 时间:17:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class test {

    @Autowired
    FunctionTreeMapper functionTreeMapper;

    @Test
    public void test(){
//        List<FunctionTree> functionTree = functionTreeMapper.getFunctionTreeById(1001);
        System.out.println(functionTreeMapper);
    }
}
