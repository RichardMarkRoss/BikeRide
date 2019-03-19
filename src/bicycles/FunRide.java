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
    public String Counter(Bicycle bicycle){
        if(maxCounter > count){
            List.add(bicycle);
            count++;
            return "accept" + this.count;
        }else{
            return "decline";
        }
    }
    public int getCountForType(BicycleType bicycleType){
        count = 0;
        for(int i = 0; i < List.size(); i++){
            if(bicycle == List.get(i)){
                return count++;
            }
        }
        return count;
    }
    public int getEnteredCount(){
        return this.List.size();
    }
}
