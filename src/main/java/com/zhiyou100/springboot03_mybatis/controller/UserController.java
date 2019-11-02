package com.zhiyou100.springboot03_mybatis.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.springboot03_mybatis.model.User;
import com.zhiyou100.springboot03_mybatis.service.UserService;
import com.zhiyou100.springboot03_mybatis.util.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.util.List;

/**
 * @author:@Rain
 * @date 2019/10/23 9:44
 * @desc
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    DataSource dataSource;

    /**
     * 查全部
     */
    @GetMapping("/{pageNo}")
    public ResultObject getAll(@PathVariable int pageNo){
        System.out.println(dataSource);
        PageHelper.startPage(pageNo,2);
        List<User> list = userService.getAll();
        PageInfo info = new PageInfo(list);
        System.out.println(info.getList());
        return new ResultObject(200,"查全部",list);
    }

   /* @GetMapping("/{id}")
    public ResultObject getOne(@PathVariable int id){
       User user = userService.getOne(id);
        return new ResultObject(200,"查询一个对象",user);
    }*/


    @PostMapping("/add")
    public ResultObject insert(@RequestBody User user){
        userService.addOne(user);
        return new ResultObject(200,"插入一个对象",null);
    }

    @DeleteMapping("/{id}")
    public ResultObject insert(@PathVariable int id){
        userService.delete(id);
        return new ResultObject(200,"删除一个成功",null);
    }

    @PutMapping("/{id}")
    public ResultObject update(@RequestBody User user,@PathVariable int id){
        user.setId(id);
        userService.updateById(user);
        return new ResultObject(200,"更新一个成功",null);
    }


}
