package com.asiainfo.dao;

import com.asiainfo.entity.FunctionTree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 作者:wangkejie
 * 日期:2019-11-28
 * 时间:16:19
 *
 * @Select 查询SQL注解
 * @Update 修改SQL注解
 * @Insert 插入数据SQL注解
 * @Delete 删除SQL注解
 * @Results 结果集字段与属性映射
 * @Result 单个字段与属性映射
 * @ResultMap 根据ID关联XML里面
 * @SelectProvider 查询高级注解-mybatis3
 * @InsertProvider 插入高级注解-mybatis3
 * @UpdateProvider 修改高级注解-mybatis3
 * @DeleteProvider 删除高级注解-mybatis3
 */
@Mapper
public interface FunctionTreeMapper {
     @Select("select * from function_tree where id = #{id}")
     List<FunctionTree> getFunctionTreeById(@Param("id") int id);

     @Select("select * from function_tree")
     List<FunctionTree> getAllFunctionTree();
}
