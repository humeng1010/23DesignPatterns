package com.red.simpleFactory2.static_factory;

/**
 * 静态工厂
 */
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("ACoffee".equals(type)) {
            coffee = new ACoffee();
        } else if ("LCoffee".equals(type)) {
            coffee = new LCoffee();
        } else {
            throw new RuntimeException("没有此咖啡");
        }

        return coffee;
    }
}
