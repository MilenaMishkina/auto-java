package practice_7.hashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueSet {

    public Set<String> removeDuplicates(List<String> input) {
        Set<String> uniqueSet = new HashSet<>();
        uniqueSet.addAll(input);
        return uniqueSet;
    }
}
