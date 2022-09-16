package com.red.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonDemo4 uniqueInstance1 = SingletonDemo4.getUniqueInstance();
        SingletonDemo4 uniqueInstance2 = SingletonDemo4.getUniqueInstance();
        System.out.println(uniqueInstance1);
        System.out.println(uniqueInstance2);
        System.out.println(uniqueInstance1 == uniqueInstance2);//true
    }
}
