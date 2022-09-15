package com.skypro;

public class Car extends Transport implements TransportWithTyre, TransportWithEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        System.out.println("Создан автомобиль " + modelName);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку автомобиля");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}
