package practice_7.linckedHashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        UniqueSet set = new UniqueSet();
        LinkedHashSet<String> testList = new LinkedHashSet<>();
        set.addUnique(testList, "Test");
    }
}
