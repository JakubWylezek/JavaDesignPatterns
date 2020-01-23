package pl.wylezek.structural.adapter;

public class MovableAdapterImpl implements MovableAdapter {

    private Movable luxuryCars;

    public MovableAdapterImpl() {
    }

    public MovableAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getSpeedInKm() {
        return convertMPHtoKM(luxuryCars.getSpeedInMph());
    }

    private double convertMPHtoKM(double mph) {
        return mph * 1.60934;
    }
}
