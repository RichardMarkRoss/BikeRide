package bicycles.specification;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class BicycleFromSpec extends BicycleBase {

    public BicycleSpecification bicycle;

        public BicycleFromSpec(BicycleSpecification bicycle){
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
    public BicycleType getBicycleType() {
        return bicycle.getBicycleType();
    }
}
