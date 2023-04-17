package com.ykongl.maintain.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author minjunyue
 * @version: 2023/4/17 14:12
 */
public class TokenUtils {

    /**
     * 过期时间
     */
    private static final long EXPIRE_DATE = 30*60*100000;

    /**
     * 设置密钥
     */
    private static final String TOKEN_SECRET = UUID.randomUUID().toString();

    public static String token(String account,String password){
        String token = "";
        try{
            //过期时间
            Date date = new Date(System.currentTimeMillis() + EXPIRE_DATE);
            //密钥及加密
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            //设置头部信息
            Map<String,Object> headers = new HashMap<>();
            headers.put("typ","JWT");
            headers.put("alg","HS256");
            token = JWT.create().withHeader(headers)
                    .withClaim("account",account)
                    .withClaim("password",password)
                    .withExpiresAt(date).sign(algorithm);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return token;
    }

    public static boolean verify(String token){
        try{
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
