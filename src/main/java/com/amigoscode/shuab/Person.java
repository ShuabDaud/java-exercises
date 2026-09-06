package com.amigoscode.shuab;

import java.util.Objects;
import java.util.StringJoiner;

public class Person {
    private String name, surname, email;
    private Address address;
    private House house;
    private Car car;

    public Person() {
    }

    public Person(String name,
                  String surname,
                  String email,
                  Address address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }

    public Person(String name,
                  String surname,
                  String email,
                  Address address,
                  House house) {
        this(name, surname, email, address);
        this.house = house;
    }

    public Person(String name,
                  String surname,
                  String email,
                  Address address,
                  House house,
                  Car car) {
        this(name, surname, email, address, house);
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(email, person.email) && Objects.equals(address, person.address) && Objects.equals(house, person.house) && Objects.equals(car, person.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, address, house, car);
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ", "Person{", "}");

        if (name != null) {
            result.add("name='" + name + "'");
        }

        if (surname != null) {
            result.add("surname='" + surname + "'");
        }

        if (email != null) {
            result.add("email='" + email + "'");
        }

        if (address != null) {
            result.add("address=" + address);
        }

        if (house != null) {
            result.add("house=" + house);
        }

        if (car != null) {
            result.add("car=" + car);
        }

        return result.toString();
    }
}
