package com.ykongl.maintain.util;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author minjunyue
 * @version: 2023/4/17 17:06
 * 拦截器
 */
public class JwtInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String token = request.getHeader("token");
        // 如果不是映射到方法直接通过
        if(!(handler instanceof HandlerMethod)) {
            return true;
        }
        if (!TokenUtils.verify(token)) {
            // 未登录跳转到登录界面
            throw  new RuntimeException("no login!");
        } else {
            return true;
        }

    }

}
