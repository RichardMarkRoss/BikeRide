package bicycles;

import java.util.ArrayList;

public class FunRide {
    private ArrayList<Bicycle> list = new ArrayList<>();
    private int maxCounter = 0;
    private BicycleType bicycle;

    public FunRide(int max){
        this.maxCounter = max;
    }

    public String counterAddBike(Bicycle bike){
        int count = 0;
        if(maxCounter > count){
            list.add(bike);
            count++;
            return "accept";
        }else{
            return "decline";
        }
    }
    public int getCountForType(BicycleType bicycle) {
        this.bicycle = bicycle;
        int count = 0;
        count = 0;
        for (Bicycle x : list) {
            if (x.getBicycleType() == bicycle){
                count ++;
            }
        }
        return count;
    }
    public int getEnteredCount(){
        return this.list.size();
     }
}
