package practice_7.treeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numsList = new TreeSet<>();
        AddUniqueNumbers list = new AddUniqueNumbers();

        list.addNumbers(numsList);
    }
}
