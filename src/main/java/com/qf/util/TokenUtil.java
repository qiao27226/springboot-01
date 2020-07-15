package com.qf.util;

import java.util.UUID;

/**
 * @program: voter
 * @description:生成令牌
 */
public class TokenUtil {
    public static String createToken(int uid){
        return UUID.randomUUID().toString().replaceAll("-","")+"_"+uid;
    }
}
