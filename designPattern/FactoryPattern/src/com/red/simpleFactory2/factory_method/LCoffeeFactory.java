package com.red.simpleFactory2.factory_method;

/**
 * 拿铁咖啡工厂 专门用来生产拿铁咖啡的
 */
public class LCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new LCoffee();
    }
}
