package com.red.simpleFactory2.factory_method;


/**
 * 咖啡店 类
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    /**
     * 点咖啡功能
     *
     * @return
     */
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
