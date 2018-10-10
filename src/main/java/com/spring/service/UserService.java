package com.spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spring.dao.UserDao;
import com.spring.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User queryUserById(Integer id){
        return userDao.queryUserById(id);
    }

    /**
     * 分页
     */
    public PageInfo<User> queryUserPage(Integer pageNum, Integer pageSize,
                                        String userName){
        /***
         * 1. 设置分页信息
         * 2. 执行原有参数查询
         * 3. 通过上一步的查询结果创建PageInfo
         * */
        //1. 设置分页信息
        PageHelper.startPage(pageNum,pageSize);
        //2. 执行原有参数查询
        List<User> userList = userDao.queryUserByParams(userName);
        //3. 通过上一步的查询结果创建PageInfo
        PageInfo<User> userPageInfo = new PageInfo<User>(userList);
        return userPageInfo;
    }

}
