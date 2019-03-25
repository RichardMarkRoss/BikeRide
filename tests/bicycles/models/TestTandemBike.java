package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTandemBike {

    @Test
    public void shouldTestTandemBike(){
            Tandem bicycle = new Tandem();
            bicycle.accelerate();
            assertEquals(7, bicycle.currentSpeed());
    }
}
