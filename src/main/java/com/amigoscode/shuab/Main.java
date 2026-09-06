package com.amigoscode.shuab;

public class Main {
    static void main() {
        Address address = new Address("25th Street",
                "Hayat Mall",
                "BN 03123",
                "Somalia");
        House house = new House(HouseType.VILLA, 35_000);
        Car car = new Car(250_000, CarModel.TESLA);

        Person shuab = new Person(
                "Shuab",
                "Daud",
                "shuab@gmail.com",
                address,
                house
        );

        System.out.println(shuab);
    }
}
