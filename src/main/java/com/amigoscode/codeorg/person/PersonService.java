package com.amigoscode.codeorg.person;

public class PersonService {
    public int addPerson(Person person) {
        if (person == null||
            person.getFirstName().isBlank() ||
            person.getLastName().isBlank()) {
            throw new IllegalArgumentException("Person cannot be null");
        }
        // add person to the db
        return 1;
    }
}
