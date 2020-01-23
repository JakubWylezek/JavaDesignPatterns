package pl.wylezek.structural.facade.light;

public class HallLight implements Light {
    @Override
    public void on() {
        System.out.println("Hall light on");
    }

    @Override
    public void off() {
        System.out.println("Hall light off");
    }
}
