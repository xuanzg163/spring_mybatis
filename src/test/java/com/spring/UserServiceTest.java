package com.spring.service;

import com.spring.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"} )
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void queryUserById() throws Exception{
        User user = userService.queryUserById(31);
        System.out.println(user);
    }
}
