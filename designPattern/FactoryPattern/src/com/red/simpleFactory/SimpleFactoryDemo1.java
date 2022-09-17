package com.red.simpleFactory;


/**
 * 简单工厂对象
 */
public class SimpleFactoryDemo1 {

    private static Fruits fruits = null;

    public static Fruits getFruit(String fruit) {
        switch (fruit) {
            case "apple":
                fruits = new Apple();
                break;
            case "banana":
                fruits = new Banana();
                break;
            default:
                System.out.println("没有此水果");
        }
        return fruits;
    }

}
