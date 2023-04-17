package com.ykongl.maintain.bean;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author minjunyue
 * @version: 2023/4/17 13:28
 */
@Data
public class Base {

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 是否删除
     */
    private String deleteFlag;
}
