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

   public static class BicycleFromSpec extends BicycleBase {

       @Override
       public void accelerate() {

       }

       @Override
       public void brake() {

       }
   }
}
