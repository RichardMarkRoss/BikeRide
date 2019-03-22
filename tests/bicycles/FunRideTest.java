package bicycles;

import bicycles.models.*;
import bicycles.rides.BikeRideTwo;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunRideTest {

    @Test
    public void shouldTestFunRide(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(4,5, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(bicycleSpecification);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        bikeRideTwo.ride();

        Bicycle Tandem = new Tandem();
        Bicycle Mountain = new MountainBike();
        Bicycle Road = new RoadBike();


        funRide funRide = new funRide(5);
        funRide.CounterAddBike(Mountain);
        funRide.CounterAddBike(Mountain);
        funRide.CounterAddBike(Mountain);
        funRide.CounterAddBike(Mountain);
        funRide.CounterAddBike(Mountain);
        funRide.getCountForType(BicycleType.MountainBike);
        assertEquals(funRide.getEnteredCount(), 5);
    }
    @Test
    public void shouldTestFunRideOneAccept(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(4,5, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(bicycleSpecification);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        bikeRideTwo.ride();

        Bicycle Mountain = new MountainBike();

        funRide funRide = new funRide(5);
        funRide.getCountForType(BicycleType.MountainBike);
        assertEquals(funRide.CounterAddBike(Mountain), "accept");
    }
    @Test
    public void shouldTestFunRideOneDecline(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(4,5, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(bicycleSpecification);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        bikeRideTwo.ride();

        Bicycle Mountain = new MountainBike();
        Bicycle Tandem = new Tandem();

        funRide funRide = new funRide(5);
        funRide.getCountForType(BicycleType.MountainBike);
        funRide.CounterAddBike(Tandem);
        funRide.CounterAddBike(Tandem);
        funRide.CounterAddBike(Tandem);
        funRide.CounterAddBike(Tandem);
        funRide.CounterAddBike(Tandem);
        assertEquals(funRide.CounterAddBike(Tandem), "decline");
    }
}