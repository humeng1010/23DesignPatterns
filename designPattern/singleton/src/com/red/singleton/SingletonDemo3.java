package com.red.singleton;

/**
 * 懒汉式-线程安全的
 */
public class SingletonDemo3 {
    private static SingletonDemo3 uniqueInstance;

    /**
     * 1.私有构造器
     */
    private SingletonDemo3() {

    }

    /**
     * 3.公开的静态方法 获得初始化的对象
     *
     * @return SingletonDemo2
     */
    public static synchronized SingletonDemo3 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonDemo3();
        }
        return uniqueInstance;
    }


}
