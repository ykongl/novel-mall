package com.ykongl.maintain.service;

import com.ykongl.maintain.bean.Result;
import com.ykongl.maintain.bean.User;
import com.ykongl.maintain.dao.LoginDao;
import com.ykongl.maintain.util.TokenUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author minjunyue
 * @version: 2023/4/17 13:38
 */
@Service
public class LoginService {

    @Resource
    private LoginDao loginDao;

    public Result login(String account, String password){
        User user = loginDao.login(account,password);
        if(user != null){
            String token = TokenUtils.token(account, password);
            HashMap<String,Object> map = new HashMap<>();
            map.put("token", token);
            map.put("data",user);
            return Result.ok(map);
        }else{
            return Result.error("登陆失败");
        }
    }


    public Result register(User user){
        int register = loginDao.register(user);
        if(register == -1){
            return Result.error("注册失败");
        }
        return Result.ok();
    }


}
