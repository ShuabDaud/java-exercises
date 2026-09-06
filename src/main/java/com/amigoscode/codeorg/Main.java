package com.amigoscode.codeorg;

import com.amigoscode.codeorg.car.Car;
import com.amigoscode.codeorg.car.CarService;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        carExample();



    }

    private static void carExample() {
        Car car = new Car("1234", new BigDecimal("10.33"));
        CarService service = new CarService();
        service.registerCar(car);
        service.registerCar(car);
        service.registerCar(car);
        service.registerCar(car);
        service.registerCar(car);
        service.registerCar(car);
        System.out.println(Arrays.toString(service.getCars()));
    }


}
