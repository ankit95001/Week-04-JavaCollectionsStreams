package com.example.reflection.accessprivatefield;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testRetrieveAge() {
        Person person = new Person(25);
        int retrievedAge = FetchPerson.retrieveAge(person);
        assertEquals(25, retrievedAge);
    }

    @Test
    void testModifyAge() {
        Person person = new Person(25);
        FetchPerson.modifyAge(person, 30);
        int modifiedAge = FetchPerson.retrieveAge(person);
        assertEquals(30, modifiedAge);
    }
}

