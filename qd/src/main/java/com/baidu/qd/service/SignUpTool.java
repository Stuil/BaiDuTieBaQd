package com.baidu.qd.service;

/**
 * @description: 接口
 * @date: 2020/8/7
 * @author: zwh
 * @version: 1.0
 */

public interface SignUpTool {
    /**
     * 用户登录
     *
     * @param username
     *            用户名
     * @param passwd
     *            密码
     * @return 登录成功返回true，失败则返回false
     */
    boolean login(String username, String passwd);

    /**
     * 签到
     *
     * @return 签到成功返回true，失败则返回falses
     */
    boolean signUp();
}
