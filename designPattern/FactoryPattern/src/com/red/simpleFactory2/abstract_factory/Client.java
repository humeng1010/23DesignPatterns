package com.red.simpleFactory2.abstract_factory;

import com.red.simpleFactory2.factory_method.Coffee;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //我想饮用意大利口味的咖啡和甜品
        //1.创建意大利口味的工厂
//        IDessertFactory factory = new IDessertFactory();
        ADessertFactory factory = new ADessertFactory();
        //2.获取拿铁咖啡和提拉米苏甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
