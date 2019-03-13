package bicycles.rides;

public class BikeRide implements Bicycle {

    private Bicycle bicycle;

    public BikeRide(Bicycle bike) {
        bicycle = bike;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void brake() {

    }
    @Override
    public int currentSpeed() {
        return bicycle.currentSpeed();
    }

    @Override
    public void stop() {

    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
}
