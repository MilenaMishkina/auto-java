package practice_7.treeMap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        SortedUsersPoints users = new SortedUsersPoints();

        TreeMap<String, Integer> testTreeMap = new TreeMap<>();

        users.getUsersPointsMap(testTreeMap);
        users.addValues(testTreeMap);
        users.getUsersPointsMap(testTreeMap);
    }
}
