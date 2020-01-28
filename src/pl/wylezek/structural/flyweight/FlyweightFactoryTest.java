package pl.wylezek.structural.flyweight;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightFactoryTest {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        for(int i = 0; i < 100; i++) {
            flyweightFactory.createRelation("Java + Spring");
        }
    }
}
