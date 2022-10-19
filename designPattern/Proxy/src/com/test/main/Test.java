package com.test.main;

import com.test.service.UserService;
import com.test.service.impl.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserService proxy = UserServiceProxy.getProxy(userService);
        proxy.login();
        proxy.delete();
        proxy.select();
    }
}
