package bicycles.models;

import bicycles.BicycleType;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBicycleSpecification {

    @Test
    public void shouldTestBikeSpecsTandem(){
        BicycleSpecification bikeSpec = new BicycleSpecification(4, 4, BicycleType.Tandem);
        bikeSpec.getAccelerationSpeed();
        assertEquals(bikeSpec.getAccelerationSpeed(),4);
        assertEquals(bikeSpec.getBrakeSpeed(),4);
        assertEquals(bikeSpec.getBicycleType(), BicycleType.Tandem);
    }
    @Test
    public void shouldTestBikeSpecsMountainbike(){
        BicycleSpecification bikeSpec = new BicycleSpecification(7, 3, BicycleType.MountainBike);
        assertEquals(bikeSpec.getAccelerationSpeed(),7);
        assertEquals(bikeSpec.getBrakeSpeed(),3);
        assertEquals(bikeSpec.getBicycleType(), BicycleType.MountainBike);
    }
    @Test
    public void shouldTestBikeSpecsRoad(){
        BicycleSpecification bikeSpec = new BicycleSpecification(1, 5, BicycleType.RoadBike);
        assertEquals(bikeSpec.getAccelerationSpeed(),1);
        assertEquals(bikeSpec.getBrakeSpeed(),5);
        assertEquals(bikeSpec.getBicycleType(), BicycleType.RoadBike);
    }
}
