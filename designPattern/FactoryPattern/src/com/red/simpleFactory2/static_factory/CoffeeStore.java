package com.red.simpleFactory2.static_factory;


/**
 * 咖啡店类
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;

    }
}
