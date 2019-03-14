package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideTwo extends BikeRide {
    public BikeRideTwo(Bicycle bike) {
        super(bike);
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
}
