package pl.wylezek.creational.prototype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car mazdaV5;
    private Car mazdaV52;

    @BeforeEach
    void  setUp() {
        mazdaV5 = new Mazda("V5", 4);
        mazdaV52 = mazdaV5.copy();
    }

    @Test
    void shouldHaveSameClassesAfterClone() {
        assertEquals(mazdaV5.getClass(), mazdaV52.getClass());
    }

    @Test
    void shouldHaveTheSameValues() {
        assertEquals(mazdaV5.getType(), mazdaV52.getType());
    }

    @Test
    void shouldHaveDiffReferences() {
        assertNotEquals(mazdaV5.hashCode(), mazdaV52.hashCode());
    }

}
