package com.amigoscode.codeorg.garage;

import com.amigoscode.codeorg.car.Car;

public class GarageService {
    // add a car to the garage
    public boolean addCarToTheGarage(Car car, Garage garage) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        }
        if (garage == null) throw new IllegalArgumentException(
                "Garage cannot be null"
        );
        // check if the capacity is greater than the current count
        int count = 0;
        for (Car c : garage.getCars()) {
            if (c != null) {
                count++;
            }
        }
        if (garage.getCapacity() <= count) {
            return false;
        }
        // otherwise add
        return true;

    }
}
