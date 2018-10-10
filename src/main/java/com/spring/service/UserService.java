package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User queryUserById(Integer id){
        return userDao.queryUserById(id);
    }
}
