package com.red.simpleFactory2.befor;

/**
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("ACoffee");
        System.out.println(coffee.getName());
    }
}
