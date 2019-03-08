package bicycles;

public class BikeRide {

    Bicycle bicycle = new Bicycle();

    public BikeRide(Bicycle bicycle) {
            BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public void Speed() {
        this.bicycle.currentSpeed();
    }
}
