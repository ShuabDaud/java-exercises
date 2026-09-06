package com.amigoscode.codeorg.garage;

import com.amigoscode.codeorg.car.Car;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class Garage {
    private int number;
    private int capacity;
    private Car[] cars;

    public Garage() {

    }
    public Garage(int number) {
        int INIT_CAPACITY = 5;
        this(number, INIT_CAPACITY);
    }

    public Garage(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.cars = new Car[capacity];
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return number == garage.number && capacity == garage.capacity && Objects.deepEquals(cars, garage.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, capacity, Arrays.hashCode(cars));
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Garage.class.getSimpleName() + "[", "]")
                .add("number=" + number)
                .add("capacity=" + capacity)
                .add("cars=" + Arrays.toString(cars))
                .toString();
    }
}
