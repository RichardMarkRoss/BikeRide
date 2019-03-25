package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBikeRideThree {
    @Test
    public void shouldTestBikeRideThree() {
        MountainBike bike = new MountainBike();
        BikeRideThree bicycle = new BikeRideThree(bike);
        bicycle.ride();
        assertEquals(bicycle.currentSpeed(), 26);
    }
    @Test
    public void shouldTestBikeRideThreeTandem() {
        Tandem bike = new Tandem();
        BikeRideThree bicycle = new BikeRideThree(bike);
        bicycle.ride();
        assertEquals(bicycle.currentSpeed(), 32);
    }
    @Test
    public void shouldTestBikeRideThreeRoad() {
        RoadBike bike = new RoadBike();
        BikeRideThree bicycle = new BikeRideThree(bike);
        bicycle.ride();
        assertEquals(bicycle.currentSpeed(), 52);
    }
}
