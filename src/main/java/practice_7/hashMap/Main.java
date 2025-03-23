package practice_7.hashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        FiveMaps map = new FiveMaps();
//        HashMap<String, Integer> testMap = new HashMap<>();
//        map.addNames(testMap);

        HashMap<String, Integer> userMap = new HashMap<>();
        userMap.put("Masha", 15);
        userMap.put("Dasha", 20);
        userMap.put("Ivan", 30);
        userMap.put("Ann", 17);

        CheckAge testMap = new CheckAge();
        testMap.printUnderage(userMap);
    }
}
