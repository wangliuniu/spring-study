package com.spring.login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 2019/3/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/login.xml"})
public class UserLoginTest {
    //自动注入max
    @Autowired
    private UserLogin userLogin;
    @Test
    public void userLogin() {
        assertEquals(true,userLogin.userLogin(userLogin.getUser()));
    }

}