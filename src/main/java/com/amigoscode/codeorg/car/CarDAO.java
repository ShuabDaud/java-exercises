package com.amigoscode.codeorg.car;

public class CarDAO {
    private static Car[] cars;
    private static int CAPACITY = 5;
    private int availableSlot = 0;
    static {
        cars = new Car[CAPACITY];
    }

    public void saveCar(Car car) {
        if (availableSlot + 1 == CAPACITY) {
            // grow db...
        }
        cars[availableSlot++] = car;
    }

    public Car[] getAllCars() {
        return cars;
    }
}
