package com.red.simpleFactory2.factory_method;

public class CCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new CCoffee();
    }
}
