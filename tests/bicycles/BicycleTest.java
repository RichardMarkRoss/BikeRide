package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.rides.BikeRide;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest{


    @Test
    public void shouldAccellerateForMountainBike() {
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    public void shouldTestBrakeForMountainBike() {
        MountainBike bicycle = new MountainBike();
        bicycle.brake();
        assertEquals(3, bicycle.currentSpeed());
    }
    @Test
    public void shouldTestBrakeForRoadBike() {
        RoadBike bicycle = new RoadBike();
        bicycle.brake();
        assertEquals(4, bicycle.currentSpeed());
    }

    @Test
    public void shouldTestStopForMountianBike() {
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
    }
    @Test
    public void shouldTestStopForRoadBike() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
    }
    @Test
    public void shouldTestBikeRideCurrentSpeed() {
        RoadBike bicycle = new RoadBike();
        BikeRideOne bikeride = new BikeRideOne(bicycle);
        bikeride.currentSpeed();
        assertEquals(0, bikeride.currentSpeed());
    }
    @Test
    public void ShouldTestBikeRide() {
        RoadBike bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRideTwo(bicycle);
        bikeRide.currentSpeed();
        assertEquals(0,bikeRide.currentSpeed());
    }
    @Test
    public void ShouldTestBikeRideTwo() {
        MountainBike bicycle = new MountainBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();
        assertEquals(41,bikeRide.currentSpeed());
    }
}
