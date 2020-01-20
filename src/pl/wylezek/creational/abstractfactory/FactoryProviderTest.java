package pl.wylezek.creational.abstractfactory;

import org.junit.jupiter.api.Test;
import pl.wylezek.creational.abstractfactory.animal.Animal;
import pl.wylezek.creational.abstractfactory.animal.Dog;
import pl.wylezek.creational.abstractfactory.color.White;

import static org.junit.jupiter.api.Assertions.*;

class FactoryProviderTest {

    @Test
    void shouldReturnAnimalFactory() {
        assertEquals(AnimalFactory.class, FactoryProvider.getFactory("Animal").getClass());
    }

    @Test
    void shouldReturnColorFactory() {
        assertEquals(ColorFactory.class, FactoryProvider.getFactory("Color").getClass());
    }

    @Test
    void shouldReturnDog() {
        assertEquals(Dog.class, FactoryProvider.getFactory("Animal").create("Dog").getClass());
    }

    @Test
    void shouldReturnWhite() {
        assertEquals(White.class, FactoryProvider.getFactory("Color").create("White").getClass());
    }

}