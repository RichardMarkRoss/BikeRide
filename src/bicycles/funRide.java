package bicycles;

import java.util.ArrayList;

public class funRide {
    private ArrayList<Bicycle> List = new ArrayList<>();
    private int maxCounter = 0;

    public funRide(int max){
        this.maxCounter = max;
    }

    public String CounterAddBike(Bicycle bike){
        int count = 0;
        if(maxCounter > count){
            List.add(bike);
            count++;
            return "accept";
        }else{
            return "decline";
        }
    }
    public int getCountForType(BicycleType bicycle) {
        int count = 0;
        count = 0;
        for (Bicycle x : List) {
            if (x.getBicycleType() == bicycle){
                count ++;
            }
        }
        return count;
    }
    public int getEnteredCount(){
        return this.List.size();
     }
}

