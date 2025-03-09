package practice_5.Aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    List<String> fishes = new ArrayList<>();


    public void getInfo(Fish fish){
        fish.info();
    }

    public void movementInfo(Fish fish) {
        fish.move();
    }

    public void addFish(Fish fish) {
        fishes.add(String.valueOf(fish));
    }

    public List<String> getFishesList() {
        return fishes;
    }

}
