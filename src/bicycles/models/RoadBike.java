package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class RoadBike extends BicycleBase {
    private int accelRoad = 11;
    private int brakeRoad = 4;

    public void accelerate() {
        changeSpeed(accelRoad);
    }

    public void brake() {
        changeSpeed(brakeRoad);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.RoadBike;
    }
}