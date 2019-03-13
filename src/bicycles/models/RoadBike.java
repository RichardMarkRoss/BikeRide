package bicycles.models;

import bicycles.rides.BicycleBase;

public class RoadBike extends BicycleBase {
    private int accelRoad = 11;
    private int brakeRoad = 4;

    public void accelerate() {
        changeSpeed(accelRoad);
    }

    public void brake() {
        changeSpeed(brakeRoad);
    }
}
