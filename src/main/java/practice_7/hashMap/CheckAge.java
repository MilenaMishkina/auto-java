package practice_7.hashMap;

import java.util.Map;

public class CheckAge {
    public void printUnderage(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() < 18) {
                    System.out.println(entry);
                }
        }
    }
}
