package practice_7.hashSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Names list1 = new Names();

        list1.getNames();
        list1.addNames();
        list1.getNames();
        list1.checkNameContainsInList("Маша");
        list1.checkNameContainsInList("Даша");

        UniqueSet list2 = new UniqueSet();
        List<String> listWithDuplicates = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        Set<String> result = list2.removeDuplicates(listWithDuplicates);
        System.out.println("Уникальные элементы: " + result);
    }
}
