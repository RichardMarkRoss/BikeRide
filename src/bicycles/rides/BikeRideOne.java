package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideOne extends BikeRide {

    public BikeRideOne(Bicycle bike) {
        super(bike);
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
