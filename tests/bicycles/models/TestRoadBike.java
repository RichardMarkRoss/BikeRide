package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRoadBike {
    @Test
    public void shouldAccellerateForRoadBike() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());
    }
}
