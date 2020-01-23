package pl.wylezek.structural.facade.door;

public class GarageDoor implements Door {

    @Override
    public void open() {
        System.out.println("GarageDoor door oper");
    }

    @Override
    public void close() {
        System.out.println("GarageDoor door close");
    }

    @Override
    public void lock() {
        System.out.println("GarageDoor door lock");
    }

    @Override
    public void unlock() {
        System.out.println("GarageDoor door unlock");
    }
}
