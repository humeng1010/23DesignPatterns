package com.red.singleton;

/**
 * 懒汉式-双重校验锁-线程安全
 */
public class SingletonDemo4 {
    private static SingletonDemo4 uniqueInstance;

    /**
     * 1.私有构造器
     */
    private SingletonDemo4() {

    }

    /**
     * 3.公开的静态方法 获得初始化的对象
     * <p>
     * 如果两个线程都执行了 if 语句，那么两个线程都会进入 if 语句块内。<br>
     * 虽然在 if 语句块内有加锁操作，但是两个线程都会执行 uniqueInstance = new Singleton(); <br>
     * 这条语句，只是先后的问题，那么就会进行两次实例化。 <br>
     * 因此必须使用双重校验锁，也就是需要使用两个 if 语句： <br>
     * 第一个 if 语句用来避免 uniqueInstance 已经被实例化之后的加锁操作， <br>
     * 而第二个 if 语句进行了加锁，所以只能有一个线程进入， <br>
     * 就不会出现 uniqueInstance == null 时两个线程同时进行实例化操作。 <br>
     *
     * @return SingletonDemo4
     */
    public static SingletonDemo4 getUniqueInstance() {
        //双重校验锁-线程安全
        if (uniqueInstance == null) {
            synchronized (SingletonDemo4.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDemo4();
                }
            }
        }
        return uniqueInstance;
    }


}
