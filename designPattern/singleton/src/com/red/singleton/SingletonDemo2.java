package com.red.singleton;

/**
 * 饿汉式-线程安全的
 */
public class SingletonDemo2 {
    /**
     * 2.定义并初始化静态资源
     */
    private static final SingletonDemo2 uniqueInstance = new SingletonDemo2();

    /**
     * 1.私有构造器
     */
    private SingletonDemo2() {

    }

    /**
     * 3.公开的静态方法 获得初始化的对象
     *
     * @return SingletonDemo2
     */
    public static SingletonDemo2 getUniqueInstance() {
        return uniqueInstance;
    }


}
