package com.amigoscode.codeorg.person;

import com.amigoscode.codeorg.cat.Cat;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Cat[] cats;


    public Person() {
    }

    public Person(String firstName, String lastName, Gender gender, Cat[] cats) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cats = cats;
    }

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Cat[] getCats() {
        return cats;
    }

    public void setCats(Cat[] cats) {
        this.cats = cats;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Objects.deepEquals(cats, person.cats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, Arrays.hashCode(cats));
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() +
                                      "{", "}")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("gender=" + gender)
                .add("cats=" + Arrays.toString(cats))
                .toString();
    }
}
