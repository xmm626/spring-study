package com.spring.service.Impl;

import com.spring.entity.User;
import com.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"/spring_mybatis.xml"} )
public class UserServiceImplTest {
@Autowired
private UserService userService;
    @Test
    public void selectUsers() {
        List<User> users =userService.selectUsers();
        users.forEach(user -> System.out.println(user));
    }
    @Test
    public void insertUser() {
        User user = new User();
        user.setAccount("test");
        user.setPassword("8888888");
        user.setCredits(999);
        int n = userService.insertUser(user);
        assertEquals(1, n);
    }

    @Test
    public void deleteUser() {
        int n = userService.deleteUser(10);
        assertEquals(1,n);
    }

    @Test
    public void updateUser() {
        User user = userService.getUser(10);
        user.setPassword("00000000");
        user.setCredits(1111111);
        int n = userService.updateUser(user);
        assertEquals(1, n);
    }
    @Test
    public void getUser() {
        User user = userService.getUser(1);
        System.out.println(user);
    }
}