package com.spring.service;

import com.github.pagehelper.PageInfo;
import com.spring.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

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


    /**
     *  测试分页实现
     * @throws Exception
     */
    @Test
    public void queryUserPage() throws Exception{
        /**
         * pageNum 当前页
         * pageSize 每页显示数目
         * userName 模糊查询参数
         */
        PageInfo<User> userPageInfo = userService.queryUserPage(1,4,"jac");

        //userPageInfo.getPages() 显示能分几页
        System.out.println(userPageInfo.getTotal() + " = " + userPageInfo.getPages());

        //获取当前页下的数据
        List<User> userList = userPageInfo.getList();
        for(User user:userList){
            System.out.println(user);
        }
    }
}
