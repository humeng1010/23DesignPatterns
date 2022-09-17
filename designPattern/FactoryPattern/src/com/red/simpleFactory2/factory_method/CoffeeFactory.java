package com.red.simpleFactory2.factory_method;

/**
 * CoffeeFactory : 抽象工厂角色
 */
public interface CoffeeFactory {

    /**
     * 创建Coffee对象的方法
     *
     * @return
     */
    Coffee createCoffee();
}
