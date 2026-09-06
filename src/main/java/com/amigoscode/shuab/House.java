package com.amigoscode.shuab;

import java.util.Objects;

public class House {
    private HouseType type;
    private double price;

    public House() {}

    public House(HouseType type, double price) {
        this.type = type;
        this.price = price;
    }

    public HouseType getType() {
        return type;
    }

    public void setType(HouseType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Double.compare(price, house.price) == 0 && type == house.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    @Override
    public String toString() {
        return "House{" +
               "type=" + type +
               ", price=" + price +
               '}';
    }
}
