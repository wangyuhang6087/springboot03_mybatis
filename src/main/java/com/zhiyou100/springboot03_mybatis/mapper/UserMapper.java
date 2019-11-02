package com.zhiyou100.springboot03_mybatis.mapper;

import com.zhiyou100.springboot03_mybatis.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author:@Rain
 * @date 2019/10/23 9:52
 * @desc
 */
@Repository
public interface UserMapper {
    // @Select相当于是<select>标签
    @Results({
            @Result(column = "idd",property = "id"),
            @Result(column = "namee",property = "name"),
            @Result(column = "pwd",property = "password"),
            @Result(column = "bir",property = "birthday")
    })
    @Select("select id idd,name namee,password pwd,birthday bir from user")
    List<User> getAll();

    @Insert("insert into user (name,password,birthday) values (#{name},#{password},#{birthday}) ")
    void addOne(User user);

    @Delete("delete form user where id = #{id}")
    void delete(int id);

    @Update("update user set name = #{name},password=#{password},birthday=#{birthday} where id = #{id}")
    void updateById(User user);

    @Select("select * from user where id = #{id}")
    User getOne(int id);

    /*@SelectProvider(type = MySelectProvider.class,method ="mysql1" )
    User getOne(@Param("id") int id);*/
}
