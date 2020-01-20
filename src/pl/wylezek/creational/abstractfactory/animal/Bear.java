package pl.wylezek.creational.abstractfactory.animal;

public class Bear implements Animal{

    private String type;
    private String sound;

    public Bear(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    public Bear() {

    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String makeSound() {
        return this.sound;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "type='" + type + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
