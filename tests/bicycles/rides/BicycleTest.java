package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest{


    @Test
    public void shouldAccellerateForMountainBike() {
        MountainBike bicycle = new MountainBike(5,0);
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }
    @Test
    public void shouldAccellerateForRoadBike() {
        RoadBike bicycle = new RoadBike(11,0);
        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());
    }
    @Test
    public void shouldTestBrakeForMountainBike() {
        MountainBike bicycle = new MountainBike(11,3);
        bicycle.brake();
        assertEquals(3, bicycle.currentSpeed());
    }
    @Test
    public void shouldTestBrakeForRoadBike() {
        RoadBike bicycle = new RoadBike(11,4);
        bicycle.brake();
        assertEquals(4, bicycle.currentSpeed());
    }

    @Test
    public void shouldTestStopForMountianBike() {
        MountainBike bicycle = new MountainBike(11,1);
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
    }
    @Test
    public void shouldTestStopForRoadBike() {
        RoadBike bicycle = new RoadBike(11,1);
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
    }
    @Test
    public void shouldTestBikeRideCurrentSpeed() {
        RoadBike bicycle = new RoadBike(12,6);
        BikeRideOne bikeride = new BikeRideOne(bicycle);
        bikeride.ride();
        assertEquals(60, bikeride.currentSpeed());
    }
    @Test
    public void ShouldTestBikeRide() {
        RoadBike bicycle = new RoadBike(0,0);
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.accelerate();
        assertEquals(0,bikeRide.currentSpeed());
    }
    @Test
    public void ShouldTestBikeRideTwo() {
        MountainBike bicycle = new MountainBike(12,10);
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();
        assertEquals(104,bikeRide.currentSpeed());
    }
}
