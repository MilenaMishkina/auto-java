package practice_7.hashSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        RemoveDuplicates list1 = new RemoveDuplicates();
//        List<String> listWithDuplicates = Arrays.asList("apple", "banana", "lemon", "apple");
//        Set<String> result = list1.removeDuplicates(listWithDuplicates);
//        System.out.println("Уникальные значения: " + result);

        Names setNames = new Names();
        setNames.getNames();
        setNames.addNames();
        setNames.getNames();
        setNames.checkSetContainsName("Masha");
        setNames.checkSetContainsName("Dasha");
    }
}
