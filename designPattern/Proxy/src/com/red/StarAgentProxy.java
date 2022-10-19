package com.red;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * 使用泛型定义代理-支持任意接口
 */
public class StarAgentProxy {
    /**
     * 设计一个方法来返回一个明星对象的代理对象
     */
    public static <T> T getProxy(T t) {
        return (T) Proxy.newProxyInstance(t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(new Date().toLocaleString() + ":收首款");
                        //让明星(被代理对象)跳舞唱歌
                        //method 正在调用的方法对象
                        //args 代表这个方法的参数
                        Object rs = method.invoke(t, args);
                        System.out.println(new Date().toLocaleString() + ":收尾款");
                        return rs;
                    }
                });
    }
}
