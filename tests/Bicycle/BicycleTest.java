package Bicycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccellerate() {
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate()
        assertEquals(0,5);
    }
    @Test
    public void shouldStop() {
        Bicycle bicycle = new Bicycle();
        bicycle.stop()
        assertEquals(0,0);
    }
    @test
    public void shouldIncreaseSpeedFiveTimes(){
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertquals(0,25)
    }
}
