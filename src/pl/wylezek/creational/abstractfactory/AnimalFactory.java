package pl.wylezek.creational.abstractfactory;

import pl.wylezek.creational.abstractfactory.animal.Animal;
import pl.wylezek.creational.abstractfactory.animal.Bear;
import pl.wylezek.creational.abstractfactory.animal.Dog;
import pl.wylezek.creational.abstractfactory.animal.Duck;

public class AnimalFactory implements AbstractFactory {

    @Override
    public Animal create(String type) {
        if("Duck".equalsIgnoreCase(type))
            return new Duck();
        else if("Dog".equalsIgnoreCase(type))
            return new Dog();
        else if("Bear".equalsIgnoreCase(type))
            return new Bear();
        return null;
    }
}
