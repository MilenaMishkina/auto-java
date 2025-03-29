package practice_7.linkedHashSet;

import java.util.LinkedHashSet;

public class UniqueSet {

    public void addUnique(LinkedHashSet<String> set, String element) {
        if (!set.contains(element)) {
            set.add(element);
            System.out.println("Element: " + element + " added to set");
        } else {
            System.out.println("Element: " + element + " already exist in set");
        }
    }
}
