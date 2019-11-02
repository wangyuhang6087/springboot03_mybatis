package com.zhiyou100.springboot03_mybatis.service;

import com.zhiyou100.springboot03_mybatis.mapper.UserMapper;
import com.zhiyou100.springboot03_mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author:@Rain
 * @date 2019/10/23 9:51
 * @desc
 */
@Service
@Transactional
public class UserService {

    @Autowired(required = false)
    UserMapper mapper;

    public List<User> getAll(){
        return  mapper.getAll();
    }

    public void addOne(User user) {

        mapper.addOne(user);
    }

    public void delete(int id) {
        mapper.delete(id);
    }

    public void updateById(User user) {
        mapper.updateById(user);
    }

    public User getOne(int id) {
       return mapper.getOne(id);
    }
}
