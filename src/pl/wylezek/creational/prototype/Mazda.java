package pl.wylezek.creational.prototype;

public class Mazda extends Car {

    private String type;
    private int doors;

    public Mazda(String type, int doors) {
        this.type = type;
        this.doors = doors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public Car copy() {
        return new Mazda(this.type, this.doors);
    }
}
