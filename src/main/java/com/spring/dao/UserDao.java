package com.spring.dao;

import com.spring.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public User queryUserById(Integer id);
}
