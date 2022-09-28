package com.red.builder1;

public class Client {
    public static void main(String[] args) {
        House simpleHouse = new SimpleHouse();

        /*simpleHouse.buildBase();
        simpleHouse.buildWalls();
        simpleHouse.buildRoof();*/

        simpleHouse.buildHouse();

        new HeightHouse().buildHouse();

    }
}
