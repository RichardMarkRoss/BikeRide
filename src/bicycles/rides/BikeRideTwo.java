package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideTwo implements BikeRide {
    private Bicycle bicycle;
    public BikeRideTwo(Bicycle bike) {
        this.bicycle = bike;
    }

    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
    }

    public int currentSpeed() {
        return bicycle.currentSpeed();
    }
}