package com.red.simpleFactory2.befor;

/**
 * 咖啡店类
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
//        声明Coffee类型的变量,根据不同类型创建不同的coffee子类对象
        Coffee coffee;
        if ("ACoffee".equals(type)) {
            coffee = new ACoffee();
        } else if ("LCoffee".equals(type)) {
            coffee = new LCoffee();
        } else {
            throw new RuntimeException("对不起你点的咖啡没有");
        }
        //加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;

    }
}
