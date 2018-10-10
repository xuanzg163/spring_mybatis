package com.spring.dao;

import com.spring.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public User queryUserById(Integer id);
    public List<User> queryUserByParams(@Param("userName") String userName);
}
