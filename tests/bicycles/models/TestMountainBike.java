package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMountainBike {
    @Test
    public void shouldAccellerateForMountainBike() {
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }
}
