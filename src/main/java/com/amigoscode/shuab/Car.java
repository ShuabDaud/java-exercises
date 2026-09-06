package com.amigoscode.shuab;

import java.util.Objects;

public class Car {
    private double price;
    private CarModel model;

    public Car() {
    }

    public Car(double price, CarModel model) {
        this.price = price;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(price, car.price) == 0 && model == car.model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, model);
    }

    @Override
    public String toString() {
        return "Car{" +
               "price=" + price +
               ", model=" + model +
               '}';
    }
}
