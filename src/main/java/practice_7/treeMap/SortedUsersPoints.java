package practice_7.treeMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortedUsersPoints {

    public void addValues(TreeMap<String, Integer> usersPointsMap) {
        System.out.println("Добавьте 5 ключей: имя, балл");
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 5; i++) {
            String name = scanner.next();
            Integer point = scanner.nextInt();
            usersPointsMap.put(name, point);
        }
    }

    public void getUsersPointsMap(TreeMap<String, Integer> usersPointsMap) {
        for (Map.Entry<String, Integer> entry : usersPointsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
