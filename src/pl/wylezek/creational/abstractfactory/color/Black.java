package pl.wylezek.creational.abstractfactory.color;

public class Black implements Color {

    private String color;

    public Black(String color) {
        this.color = color;
    }

    public Black() {

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
        return "Black{" +
                "color='" + color + '\'' +
                '}';
    }
}
