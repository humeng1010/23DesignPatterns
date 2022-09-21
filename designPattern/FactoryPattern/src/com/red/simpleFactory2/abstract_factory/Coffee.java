package com.red.simpleFactory2.abstract_factory;

/**
 * 咖啡类
 */
public abstract class Coffee {

    public abstract String getName();

    //    加糖 addSugar
    public void addSugar() {
        System.out.println("加糖");
    }

    //    加奶 addMilk
    public void addMilk() {
        System.out.println("加奶");
    }

}
