package practice_7.treeMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortedUsersPoints {
    private TreeMap<String, Integer> usersPointsMap;

    public SortedUsersPoints() {
        this.usersPointsMap = new TreeMap<>();
    }
    public void addValues() {
        System.out.println("Введите 5 значение: имя - балл");
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 5; i++) {
            String name = scanner.next();
            Integer point = scanner.nextInt();
            usersPointsMap.put(name, point);
        }
    }

    public void getUsersMap() {
        for (Map.Entry<String, Integer> entry : usersPointsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
