package bicycles;

import bicycles.models.BicycleFromSpec;

import java.util.ArrayList;

public class FunRide extends BicycleFromSpec {
    private ArrayList<Bicycle> List = new ArrayList<>();
    private int maxCounter = 0;
    private int count = 0;

    public void FunRide(int max){
        this.maxCounter = max;
    }
    public String CounterAddBike(Bicycle bicycle){
        if(maxCounter > count){
            List.add(bicycle);
            count++;
            return "accept";
        }else{
            return "decline";
        }
    }
    public int getCountForType(BicycleType bicycle){
        count = 0;
        for(int i = 0; i < List.size(); i++){
            if(bicycle == List.get(i).BicycleType()){
                return count++;
            }
        }
        return count;
    }
    public int getEnteredCount(){
        return this.List.size();
    }
}
