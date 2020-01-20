package pl.wylezek.creational.abstractfactory;

import pl.wylezek.creational.abstractfactory.color.Black;
import pl.wylezek.creational.abstractfactory.color.Brown;
import pl.wylezek.creational.abstractfactory.color.Color;
import pl.wylezek.creational.abstractfactory.color.White;

public class ColorFactory implements AbstractFactory {

    @Override
    public Color create(String type) {
        if("White".equalsIgnoreCase(type))
            return new White();
        else if("Brown".equalsIgnoreCase(type))
            return new Brown();
        else if("Black".equalsIgnoreCase(type))
            return new Black();

        return null;
    }
}
