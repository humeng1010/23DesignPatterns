package com.red.simpleFactory2.static_factory;


public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("ACoffee");
        System.out.println(coffee.getName());
    }
}
