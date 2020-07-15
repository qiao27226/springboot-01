package com.qf.config;

/**
 * @program: voter
 * @description:设置登录令牌在redis中存储的有效期
 */
public class RedisKeyConfig {
    //令牌
    public static final String PHONE_TOKEN="voter:phone:";//后面追加手机号 值存储令牌
    public static final String TOKEN_USER="voter:token:";//后面追加令牌 值存储用户信息

    //有效期
    public static final int TOKEN_TIME=30*60; //令牌有效期 单位秒
}
