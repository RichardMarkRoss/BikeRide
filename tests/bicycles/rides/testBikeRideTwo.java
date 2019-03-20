package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBikeRideTwo {
    @Test
    public void shouldTestBikeRideTwo() {
        MountainBike bike = new MountainBike();
        BikeRideTwo bicycle = new BikeRideTwo(bike);
        bicycle.ride();
        assertEquals(bicycle.currentSpeed(), 41);
    }

    @Test
    public void shouldTestBikeRideTwoTandem() {
        Tandem bike = new Tandem();
        BikeRideTwo bicycle = new BikeRideTwo(bike);
        bicycle.ride();
        assertEquals(bicycle.currentSpeed(), 53);
    }

    @Test
    public void shouldTestBikeRideTwoRoad() {
        RoadBike bike = new RoadBike();
        BikeRideTwo bicycle = new BikeRideTwo(bike);
        bicycle.ride();
        assertEquals(bicycle.currentSpeed(), 85);
    }
}