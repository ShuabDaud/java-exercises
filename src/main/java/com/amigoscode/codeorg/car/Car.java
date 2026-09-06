package com.amigoscode.codeorg.car;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.StringJoiner;

public class Car implements Serializable {
    private String regNumber;
    private BigDecimal price;

    public Car() {
    }

    public Car(String regNumber, BigDecimal price) {
        this.regNumber = regNumber;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(regNumber, car.regNumber) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, price);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("regNumber='" + regNumber + "'")
                .add("price=" + price)
                .toString();
    }
}
