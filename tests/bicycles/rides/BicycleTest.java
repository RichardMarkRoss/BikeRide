package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
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
    public void shouldAccellerateForRoadBike() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());
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
        bikeride.ride();
        assertEquals(52, bikeride.currentSpeed());
    }
    @Test
    public void ShouldTestBikeRide() {
        RoadBike bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.accelerate();
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
