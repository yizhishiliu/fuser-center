package com.jmd.fusercenterbackend.service;

import com.jmd.fusercenterbackend.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/5/4 004 16:45
 * File: UserServiceTest
 * Description:
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void testAddUser() {
        User user = new User();
        user.setUsername("ff");
        user.setUserAccount("1001");
        user.setAvatarUrl("https://...");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("155XXXXXXXX");
        user.setEmail("xxxx@xxx.com");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }


    @Test
    void userRegister() throws NoSuchAlgorithmException {
        long userId = userService.userRegister("test", "123456", "123456");
        Assertions.assertEquals(-1, userId);

        long userId2 = userService.userRegister("te st", "123456", "123456");
        Assertions.assertEquals(-1, userId);
    }
}