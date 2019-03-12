package bicycles.rides;

public class BicycleBase implements Bicycle{
    private int speed = 0;

    protected int changeSpeed = (int)(speed += speed);

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void brake() {

    }

    @Override
    public int currentSpeed() {
        return speed;
    }
}
