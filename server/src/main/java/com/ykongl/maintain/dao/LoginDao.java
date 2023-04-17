package com.ykongl.maintain.dao;

import com.ykongl.maintain.bean.User;
import org.springframework.stereotype.Repository;

/**
 * @author minjunyue
 * @version: 2023/4/13 15:32
 */
public interface LoginDao {

    /**
     * 登陆
     * @param account
     * @param password
     * @return
     */
    User login(String account, String password);

    /**
     * 注册
     * @param user
     * @return
     */
    int register(User user);


}
