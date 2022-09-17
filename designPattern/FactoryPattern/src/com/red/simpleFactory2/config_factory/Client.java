package com.red.simpleFactory2.config_factory;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName() + american);

        System.out.println("============");

        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName() + latte);

        System.out.println("============");

        Coffee iceAmerican = CoffeeFactory.createCoffee("ice-american");
        System.out.println(iceAmerican.getName() + iceAmerican);

    }
}
