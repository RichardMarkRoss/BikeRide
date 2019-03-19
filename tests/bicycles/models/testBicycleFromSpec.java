package bicycles.models;

import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBicycleFromSpec {

    @Test
    public void shouldTestBikeFromSpecsTandem(){
        BicycleSpecification bikeSpec = new BicycleSpecification(4 ,8 , BicycleType.Tandem);
        BicycleFromSpec bikeFromSpec = new BicycleFromSpec(bikeSpec);

        assertEquals(bikeFromSpec.currentSpeed(), 0);
    }

    @Test
    public void shouldTestBikeFromSpecsMountBike(){
        BicycleSpecification bikeSpec = new BicycleSpecification(4 ,8 , BicycleType.MountainBike);
        BicycleFromSpec bikeFromSpec = new BicycleFromSpec(bikeSpec);

        assertEquals(bikeFromSpec.bicycle, );
    }
}
