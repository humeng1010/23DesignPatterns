package com.red.simpleFactory2.factory_method;

/**
 * 美式咖啡工厂对象 专门用来生产美式咖啡
 */
public class ACoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new ACoffee();
    }
}
