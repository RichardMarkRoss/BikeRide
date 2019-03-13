package bicycles.models;

import bicycles.rides.BicycleBase;

public class RoadBike extends BicycleBase {
    private int accelRoad;
    private int brakeRoad;
    public RoadBike(int accelRoad, int brakeRoad){
        this.accelRoad = accelRoad;
        this.brakeRoad = brakeRoad;
    }
    public void accelerate() {
        changeSpeed(accelRoad);
    }

    public void brake() {
        changeSpeed(brakeRoad);
    }
}
