package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class Tandem extends BicycleBase {
    private int accelRoad = 7;
    private int brakeRoad = 2;

    public void accelerate() {
        changeSpeed(accelRoad);
    }

    public void brake() {
        changeSpeed(brakeRoad);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.Tandem;
    }
}
