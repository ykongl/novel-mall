package com.ykongl.maintain.bean;

import lombok.Data;

/**
 * @author minjunyue
 * @version: 2023/4/17 13:26
 */
@Data
public class User extends Base{

    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 账号
     */
    private String account;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 角色
     */
    private String role;

    /**
     * 电话号码
     */
    private String phone;
}
