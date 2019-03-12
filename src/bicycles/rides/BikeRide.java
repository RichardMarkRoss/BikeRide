package bicycles.rides;

public class BikeRide implements Bicycle {

    Bicycle bicycle = new Bicycle;

    public BikeRide(Bicycle bicycle) {
            BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
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
    //14
    }

    public void Speed() {
        this.bicycle.currentSpeed();
    }
}
