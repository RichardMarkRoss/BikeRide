package bicycles.models;

import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {
   private int accelMountain = 5;
   private int brakeMountian = 3;
   public void accelerate() {
      changeSpeed(accelMountain);
   }

   public void brake() {
      changeSpeed(brakeMountian);
   }

    @Override
    public void BicycleType() {

    }

}

