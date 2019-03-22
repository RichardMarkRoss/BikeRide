package bicycles;

import java.util.ArrayList;

public class funRide {
    private ArrayList<Bicycle> List = new ArrayList<>();
    private int maxCounter = 0;
    private int getCountFor = 0;


    public funRide(int max){
        this.maxCounter = max;
    }
    public String CounterAddBike(Bicycle bike){
        if(maxCounter > getCountFor){
            List.add(bike);
            getCountFor++;
            return "accept";
        }else{
            return "decline";
        }
    }
    public int getCountForType(BicycleType bicycle) {
        getCountFor = 0;
        for (Bicycle x : List) {
            if (x.getBicycleType() == bicycle){
                getCountFor++;
            }
        }
        return getCountFor;
    }
    public int getEnteredCount(){
        return this.List.size();
    }

}
