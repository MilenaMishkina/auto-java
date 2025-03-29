package practice_7.linkedHashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        UniqueSet set = new UniqueSet();
        LinkedHashSet<String> testSet = new LinkedHashSet<>();

        set.addUnique(testSet, "Test");
        set.addUnique(testSet, "Test");
    }
}
