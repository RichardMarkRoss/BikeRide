package bicycles.specification;

import bicycles.BicycleType;

public class BicycleSpecification {
    private BicycleType bicycleType;
    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.bicycleType = bicycleType;
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }
    public int getBrakeSpeed(){
        return brakeSpeed;
    }
    public BicycleType getBicycleType(){ return bicycleType; }
}
