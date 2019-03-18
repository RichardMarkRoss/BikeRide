package bicycles.models;

import bicycles.BicycleBase;
public class BicycleFromSpec extends BicycleBase {
        private BicycleSpecification bicycle;
        BicycleFromSpec(BicycleSpecification bicycle){
            this.bicycle = bicycle;
       }

    @Override
    public void accelerate() {
        changeSpeed(this.bicycle.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        changeSpeed(this.bicycle.getBrakeSpeed());
    }

    @Override
    public String getBicycleType() {
        return this.bicycle.getBicycleType();
    }
}
