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
    public String getEnteredCount(){
        if(maxCounter > count){
            List.add((Bicycle) bicycle);
            count++;
            return "accept" + this.count;
        }else{
            return "decline";
        }
    }
    public void getCountForType(){
        count = 0;
        for(int i = 0; i < List.size(); i++){
            
        }
    }

}
