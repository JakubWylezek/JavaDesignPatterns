package pl.wylezek.creational.abstractfactory.color;

public class Brown implements Color {

    private String color;

    public Brown(String color) {
        this.color = color;
    }

    public Brown() {

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
        return "Brown{" +
                "color='" + color + '\'' +
                '}';
    }
}

