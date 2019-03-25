package bicycles;


public abstract class BicycleBase implements Bicycle {
    private int speed = 0;
    private BicycleType bicycleType;

    protected void changeSpeed(int speed) {
        this.speed += speed;
    }
    @Override
    public void stop() {
        this.speed = 0;
    }
    @Override
    public int currentSpeed() {
        return speed;
    }

    public BicycleType getBicycleType(BicycleType bicycleType){
       return this.bicycleType = bicycleType;
    }
}
