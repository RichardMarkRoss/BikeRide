package bicycles.models;

class BicycleSpecification {
    private String bicycleType;
    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed,String BicycleType) {
        this.bicycleType = bicycleType;
        if (bicycleType == bicycles.BicycleType.RoadBike.toString()){

            this.accelerationSpeed = accelerationSpeed;
            this.brakeSpeed = brakeSpeed;

        }else if(bicycleType == bicycles.BicycleType.MountainBike.toString()){

            this.accelerationSpeed = accelerationSpeed;
            this.brakeSpeed = brakeSpeed;

        }else if(bicycleType == bicycles.BicycleType.Tandem.toString()){

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

    public String getBicycleType(){
        return bicycleType;
    }
}
