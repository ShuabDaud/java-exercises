package com.amigoscode.codeorg.car;

import java.util.Arrays;

public class CarService {
    private CarDAO carDAO;
    public CarService() {
        this.carDAO = new CarDAO();
    }

    public int registerCar(Car car) {
        // check if car is not null
        // check if regNumber is valid
        // check if regNumber is not taken
        // check if price is not less than 0

        try {
            carDAO.saveCar(car);
            return 1;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return -1;
        }


    }
    public Car[] getCars() {
        return carDAO.getAllCars();
    }
}
