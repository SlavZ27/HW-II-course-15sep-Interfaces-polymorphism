package com.skypro;

public class Truck extends Transport   {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        System.out.println("Создан грузовик " + modelName);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }
}
