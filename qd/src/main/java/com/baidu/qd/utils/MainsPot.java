package com.baidu.qd.utils;

import com.baidu.qd.controller.BaiduSignUp;
import com.baidu.qd.service.SignUpTool;

/**
 * @title: MainsPot
 * @description:
 * @date: 2020/8/7
 * @author: zwh
 * @copyright: Copyright (c) 2020
 * @version: 1.0
 */

public class MainsPot {
    public static String username = "123456";
    public static String passwd = "123456";
    public static int mInterval = 30;

    public static void main(String[] args) {
        boolean isSignup = false;
        boolean isLogin = false;
        SignUpTool tool = new BaiduSignUp();
        // SignUpTool tool = new BBSLogin();
        while (true) {
            try {
                isLogin = tool.login(username, passwd);
                isSignup = tool.signUp();
                if (isLogin && isSignup) {
                    // 签到成功则三小时后再签到
                    System.out.println("continue after three hours...");
                    Thread.sleep(3 * 60 * 60 * 1000);
                } else {
                    // 签到失败则30分钟后再次签到
                    System.out.println("continue after " + mInterval
                            + " minites...");
                    Thread.sleep(mInterval * 60 * 1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
