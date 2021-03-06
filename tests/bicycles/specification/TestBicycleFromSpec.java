package bicycles.specification;

import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBicycleFromSpec {

    @Test
    public void shouldTestBikeFromSpecsBrake(){
        BicycleSpecification bikeSpec = new BicycleSpecification(4 ,8 , BicycleType.Tandem);
        BicycleFromSpec bikeFromSpec = new BicycleFromSpec(bikeSpec);

        assertEquals(bikeFromSpec.bicycle.getBrakeSpeed(), 8);
    }
    @Test
    public void shouldTestBikeFromSpecsAccel(){
        BicycleSpecification bikeSpec = new BicycleSpecification(4 ,8 , BicycleType.MountainBike);
        BicycleFromSpec bikeFromSpec = new BicycleFromSpec(bikeSpec);

        assertEquals(bikeFromSpec.bicycle.getAccelerationSpeed(), 4);
    }
    @Test
    public void shouldTestBikeFromSpecsType(){
        BicycleSpecification bikeSpec = new BicycleSpecification(4 ,8 , BicycleType.Tandem);
        BicycleFromSpec bikeFromSpec = new BicycleFromSpec(bikeSpec);
        assertEquals(bikeFromSpec.bicycle.getBicycleType(), BicycleType.Tandem);
    }
}
