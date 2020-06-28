package com.example.demo.tools;

import com.example.demo.dto.user;

/**
 * @Author: MaSheng
 * @Date: 2020/6/10 17:10
 * @Description:
 * @version:1.0
 */
public class UserTool {
    private static ThreadLocal<user> userThreadLocal = new ThreadLocal<>();

    public static void setUserTool(user userTool){
        userThreadLocal.set(userTool);
    }

    public static user getUserTool(){
        user u = userThreadLocal.get();
        return u;
    }

    public static void removeUser(){
        userThreadLocal.remove();
    }

}
