package pl.wylezek.creational.prototype;

public class Hyundai extends Car {

    private String type;
    private int horsePower;

    public Hyundai(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public Car copy() {
        return new Hyundai(this.type, this.horsePower);
    }
}
