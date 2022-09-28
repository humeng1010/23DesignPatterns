package com.red.builder1;

public abstract class House {
    public abstract void buildBase();

    public abstract void buildWalls();

    public abstract void buildRoof();

    public void buildHouse() {
        buildBase();
        buildWalls();
        buildRoof();
    }
}
