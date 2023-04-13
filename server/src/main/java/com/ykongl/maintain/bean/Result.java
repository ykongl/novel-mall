package com.ykongl.maintain.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author minjunyue
 * @version: 2023/4/13 16:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private int code;
    private String message;
    private Object data;
    private int total;

    public static Result ok(){
        return new Result(200,null,null,0);
    }

    public static Result ok(Object data){
        return new Result(200,null,data,0);
    }

    public static Result ok(List<?> data,int total){
        return new Result(200,null,data,total);
    }

    public static Result error(String message){
        return new Result(400,message,null,0);
    }

}
