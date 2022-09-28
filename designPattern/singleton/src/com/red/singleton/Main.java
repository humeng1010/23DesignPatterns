package com.red.singleton;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        SingletonDemo4 uniqueInstance1 = SingletonDemo4.getUniqueInstance();
        SingletonDemo4 uniqueInstance2 = SingletonDemo4.getUniqueInstance();
        System.out.println(uniqueInstance1);
        System.out.println(uniqueInstance2);
        System.out.println(uniqueInstance1 == uniqueInstance2);//true

        System.out.println("====================================");

        NoSingletonDemo1 noSingletonDemo1 = new NoSingletonDemo1();
        noSingletonDemo1.setName("张三");
        noSingletonDemo1.setAge(18);
        NoSingletonDemo1 noSingletonDemo2 = new NoSingletonDemo1();
        noSingletonDemo2.setName("张三");
        noSingletonDemo2.setAge(18);
        System.out.println(noSingletonDemo1);
        System.out.println(noSingletonDemo2);
        System.out.println(noSingletonDemo1 == noSingletonDemo2);//false
        System.out.println(noSingletonDemo1.equals(noSingletonDemo2));//false(不重写equals方法,默认比较的是地址) true(重写equals方法,比较的是值)

        System.out.println("====================================");
        try {
            Class<SingletonDemo1> singletonDemo1Class = SingletonDemo1.class;
            Constructor<SingletonDemo1> declaredConstructor = singletonDemo1Class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            SingletonDemo1 singletonDemo1 = declaredConstructor.newInstance();
            System.out.println("singletonDemo1 = " + singletonDemo1);
            SingletonDemo1 singletonDemo2 = declaredConstructor.newInstance();
            System.out.println("singletonDemo2 = " + singletonDemo2);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
