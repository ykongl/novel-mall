package com.ykongl.maintain.controller;

import com.ykongl.maintain.bean.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author minjunyue
 * @version: 2023/4/13 15:39
 */

@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/info")
    public Result login(){
        String text = "Hello,novel!";
        return Result.ok(text);
    }
}
