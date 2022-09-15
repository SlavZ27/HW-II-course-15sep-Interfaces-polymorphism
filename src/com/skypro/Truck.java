package com.skypro;

public class Truck extends Transport implements TransportWithEngine, TransportWithTyre, TransportWithTrailer {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        System.out.println("Создан грузовик " + modelName);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }
}
