package practice_7.hashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        FiveNames map = new FiveNames();
//        HashMap<String, Integer> testMap = new HashMap<>();
//        map.addNames(testMap);

        HashMap<String, Integer> userMap = new HashMap<>();
        userMap.put("Masha", 15);
        userMap.put("Dasha", 25);
        userMap.put("Sasha", 78);
        userMap.put("Ivan", 7);

        Underage testMap = new Underage();
        testMap.printUnderage(userMap);
    }
    }
