package com.red.simpleFactory2.factory_method;


public class Client {
    public static void main(String[] args) {
//        创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();
//        创建对象
//        CoffeeFactory coffeeFactory = new LCoffeeFactory();
        CoffeeFactory coffeeFactory = new CCoffeeFactory();
        coffeeStore.setFactory(coffeeFactory);
//        点咖啡
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());


    }
}
