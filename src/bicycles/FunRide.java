package bicycles;

import java.util.ArrayList;

public class FunRide {
    private ArrayList<Bicycle> List = new ArrayList<>();
    private int maxCounter = 0;
    private int count = 0;


    public FunRide(int max){
        this.maxCounter = max;
    }
    public String CounterAddBike(Bicycle bike){
        if(maxCounter > count){
            List.add(bike);
            count++;
            return "accept";
        }else{
            return "decline";
        }
    }
    public int getCountForType(BicycleType bicycle) {
        count = 0;
        for (Bicycle x : List) {
            if (x.getBicycleType() == bicycle){
                count++;
            }
        }
        return count;
    }
    public int getEnteredCount(){
        return this.List.size();
    }

}
