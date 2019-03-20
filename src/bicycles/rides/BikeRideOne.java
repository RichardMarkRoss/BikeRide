package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideOne implements BikeRide {

    private Bicycle bicycle;

    public BikeRideOne(Bicycle bike) {
    this.bicycle = bike;
    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
     public int currentSpeed() {
        return bicycle.currentSpeed();
    }

}
