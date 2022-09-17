package com.red.simpleFactory2.abstract_factory;

import com.red.simpleFactory2.factory_method.Coffee;
import com.red.simpleFactory2.factory_method.LCoffee;

/**
 * 意大利风味的工厂 可以创建:拿铁咖啡,提拉米苏...
 */
public class IDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
