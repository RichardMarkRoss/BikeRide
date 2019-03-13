package bicycles.rides;

public class BikeRide implements Bicycle{

    public Bicycle bicycle;
    public BikeRide(Bicycle bike) {
        bicycle = bike;
    }
    @Override
    public void accelerate() {

    }
    @Override
    public void brake() {

    }
    @Override
    public int currentSpeed() {
        return bicycle.currentSpeed();
    }
    @Override
    public void stop() {

    }
}
