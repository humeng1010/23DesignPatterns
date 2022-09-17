package com.red.simpleFactory2.abstract_factory;

import com.red.simpleFactory2.factory_method.ACoffee;
import com.red.simpleFactory2.factory_method.Coffee;

/**
 * 美式风味的工厂 可以创建:美式咖啡,抹茶慕斯...
 */
public class ADessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new ACoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
