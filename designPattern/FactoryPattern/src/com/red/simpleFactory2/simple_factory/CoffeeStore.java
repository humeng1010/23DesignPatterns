package com.red.simpleFactory2.simple_factory;


/**
 * 咖啡店类
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
//        调用生成咖啡的方法
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
//加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;

    }
}
