package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBikeRideOne {
    @Test
    public void shouldTestBikeRideOne(){
        MountainBike bike = new MountainBike();
        BikeRideOne bicycle = new BikeRideOne(bike);
        bicycle.ride();
        assertEquals(bicycle.currentSpeed(), 26);
    }
    @Test
    public void shouldTestBikeRideoneTandem(){
        Tandem bike = new Tandem();
        BikeRideOne bicycle = new BikeRideOne(bike);
        bicycle.ride();
        assertEquals(bicycle.currentSpeed(), 32);
    }
    @Test
    public void shouldTestBikeRideOneRoad(){
        RoadBike bike = new RoadBike();
        BikeRideOne bicycle = new BikeRideOne(bike);
        bicycle.ride();
        assertEquals(bicycle.currentSpeed(), 52);
    }
}
