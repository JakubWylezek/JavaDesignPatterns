package pl.wylezek.structural.facade.door;

public class MainDoor implements Door {


    @Override
    public void open() {
        System.out.println("Main door oper");
    }

    @Override
    public void close() {
        System.out.println("Main door close");
    }

    @Override
    public void lock() {
        System.out.println("Main door lock");
    }

    @Override
    public void unlock() {
        System.out.println("Main door unlock");
    }
}
