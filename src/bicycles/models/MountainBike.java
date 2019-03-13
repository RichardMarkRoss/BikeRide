package bicycles.models;

import bicycles.rides.BicycleBase;

public class MountainBike extends BicycleBase {
   private int accelMountain;
   private int brakeMountian;

   public MountainBike(int accelMountain, int brakeMountian){
      this.accelMountain = accelMountain;
      this.brakeMountian = brakeMountian;
   }
   public void accelerate() {
      changeSpeed(accelMountain);
   }

   public void brake() {
      changeSpeed(brakeMountian);
   }
}
