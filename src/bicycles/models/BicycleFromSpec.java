package bicycles.models;

import bicycles.BicycleBase;
public class BicycleFromSpec extends BicycleBase {
        public BicycleSpecification bicycle;
        BicycleFromSpec(BicycleSpecification bicycle){
            this.bicycle = bicycle;
       }

    public BicycleFromSpec() {
    }

    @Override
    public void accelerate() {
        changeSpeed(this.bicycle.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        changeSpeed(this.bicycle.getBrakeSpeed());
    }
}
