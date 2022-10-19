package com.test.service.impl;

import com.test.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void login() {
        try {
            Thread.sleep(3000);
            System.out.println("用户登陆了");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete() {
        try {
            Thread.sleep(2000);
            System.out.println("用户删除了");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void select() {
        try {
            Thread.sleep(5000);
            System.out.println("用户查询了");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
