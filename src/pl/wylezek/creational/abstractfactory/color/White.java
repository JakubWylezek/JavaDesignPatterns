package pl.wylezek.creational.abstractfactory.color;

public class White implements Color {

    private String color;

    public White(String color) {
        this.color = color;
    }

    public White() {

    }

    @Override
    public String getColor() {
        return null;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "White{" +
                "color='" + color + '\'' +
                '}';
    }
}
