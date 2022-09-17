package com.red.simpleFactory2.abstract_factory;

import com.red.simpleFactory2.factory_method.Coffee;

public interface DessertFactory {
    //生成咖啡的功能
    Coffee createCoffee();

    //生成甜品的功能
    Dessert createDessert();
}
