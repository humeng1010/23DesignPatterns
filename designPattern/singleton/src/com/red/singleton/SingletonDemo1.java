package com.red.singleton;

/**
 * 懒汉单例模式-线程不安全
 */
public class SingletonDemo1 {
    private static SingletonDemo1 uniqueInstance;

    //    私有构造器
    private SingletonDemo1() {
    }

    /**
     * 懒汉式创建单例对象
     *
     * @return
     */
    public static SingletonDemo1 getUniqueInstance() {
//        线程不安全,如果有多个线程到达if判断,而且都是null,就会创建出多个实例对象
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonDemo1();
        }
        return uniqueInstance;
    }
}
