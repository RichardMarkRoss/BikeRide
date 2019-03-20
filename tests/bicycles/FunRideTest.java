package bicycles;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleSpecification;
import bicycles.models.MountainBike;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunRideTest {

    @Test
    public void shouldTestFunRide(){
//        BicycleSpecification rider = new BicycleSpecification(4,4,BicycleType.MountainBike);
//        Bicycle bicycle = new BicycleFromSpec(rider);
//        BikeRideOne bike = new BikeRideOne(bicycle);
//        bike.ride();
        FunRide funRide = new FunRide(4);
        funRide.CounterAddBike();
    assertEquals(funRide.getEnteredCount(), 4);
    }

}