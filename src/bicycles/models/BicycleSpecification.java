package bicycles.models;

import bicycles.BicycleType;

public class BicycleSpecification {
    private BicycleType bicycleType;
    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed,BicycleType bicycleType) {
        this.bicycleType = bicycleType;
        if (bicycleType.equals(BicycleType.RoadBike)){

            this.accelerationSpeed = accelerationSpeed;
            this.brakeSpeed = brakeSpeed;

        }else if(bicycleType.equals(BicycleType.MountainBike)){

            this.accelerationSpeed = accelerationSpeed;
            this.brakeSpeed = brakeSpeed;

        }else if(bicycleType.equals(BicycleType.Tandem)){

            this.accelerationSpeed = accelerationSpeed;
            this.brakeSpeed = brakeSpeed;
        }
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }

    public int getBrakeSpeed(){
        return brakeSpeed;
    }

    public int getBicycleType(){
        return this.bicycleType;
    }
}
