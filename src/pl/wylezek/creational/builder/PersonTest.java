package pl.wylezek.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void shouldCreatePersonWithNameAndLastNameUsingBuilder() {
        Person person = new Person.Builder().name("Adam").lastName("Kowalski").build();

        assertEquals("Adam", person.getName());
        assertEquals("Kowalski", person.getLastName());
    }

    @Test
    void shouldCretePersonWithGender() {
        Person person = new Person.Builder().name("Adam").lastName("Kowalski").gender(Gender.MALE).build();

        assertEquals(Gender.MALE, person.getGender());
    }

    @Test
    void shouldThrowIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> {Person person = new Person.Builder().build(); });
    }
}