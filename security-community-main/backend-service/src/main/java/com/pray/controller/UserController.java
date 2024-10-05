package com.pray.controller;

import com.pray.entity.User;
import com.pray.service.UserService;
import com.pray.utils.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author Johnny
 * @since 2024/7/13 23:05
 */
@RestController
@RequestMapping("/ua")
public class UserController {
    @Resource
    UserService userService;
    @GetMapping("/userInfo")
    public Result<User> getUserInfo(@RequestParam String username){
        return userService.getUserInfo(username);
    }
}
