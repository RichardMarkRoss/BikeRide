package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccellerate() {
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }
    @Test
    public void shouldStop() {
        Bicycle bicycle = new Bicycle();
        bicycle.stop();
        assertEquals(0,bicycle.currentSpeed());
    }
    @Test
    public void shouldIncreaseSpeedFiveTimes(){
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(5,bicycle.currentSpeed());
    }
}
