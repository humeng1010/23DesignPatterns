package com.red.simpleFactory;


public class Main {
    public static void main(String[] args) {
        Fruits banana1 = SimpleFactoryDemo1.getFruit("banana");
        Fruits banana2 = SimpleFactoryDemo1.getFruit("banana");
        System.out.println(banana1);
        System.out.println(banana2);
        System.out.println(banana1 == banana2);
        Fruits apple = SimpleFactoryDemo1.getFruit("apple");
        System.out.println(apple);
    }
}
