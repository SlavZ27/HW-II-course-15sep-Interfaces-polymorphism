package com.skypro;

public class Bicycle extends Transport  {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        System.out.println("Создан велосипед " + modelName);
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }
}
