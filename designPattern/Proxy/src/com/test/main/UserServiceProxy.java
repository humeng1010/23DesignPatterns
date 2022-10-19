package com.test.main;

import com.test.service.UserService;

import java.lang.reflect.Proxy;

public class UserServiceProxy {
    public static UserService getProxy(UserService userService) {

        return (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), (proxy, method, args) -> {
                    long before = System.currentTimeMillis();
                    
                    System.out.println(method.getName() + "方法开始执行了");

                    Object invoke = method.invoke(userService, args);

                    long after = System.currentTimeMillis();
                    long time = after - before;
                    System.out.println("执行" + method.getName() + "方法花费了" + time + "ms");
                    return invoke;
                });

    }
}
