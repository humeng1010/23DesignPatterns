package com.red.simpleFactory2.simple_factory;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("LCoffee");
        System.out.println(coffee.getName());
    }
}
