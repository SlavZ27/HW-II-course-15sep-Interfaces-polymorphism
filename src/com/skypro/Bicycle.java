package com.skypro;

public class Bicycle extends Transport implements TransportWithTyre {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        System.out.println("Создан велосипед " + modelName);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }
}
