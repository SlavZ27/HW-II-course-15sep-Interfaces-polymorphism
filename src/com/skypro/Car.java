package com.skypro;

public class Car extends Transport  {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        System.out.println("Создан автомобиль " + modelName);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку автомобиля");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}
