package com.ykongl.maintain.controller;

import com.ykongl.maintain.bean.Result;
import com.ykongl.maintain.bean.User;
import com.ykongl.maintain.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author minjunyue
 * @version: 2023/4/13 15:39
 */

@RestController
@RequestMapping("/login")
public class LoginController {

    @Resource
    private LoginService loginService;

    @GetMapping("/in")
    public Result login(@Param("account") String account,@Param("password") String password){
        return loginService.login(account,password);
    }


    @PostMapping("/register")
    public Result register(@RequestBody User user){
        return loginService.register(user);
    }
}
