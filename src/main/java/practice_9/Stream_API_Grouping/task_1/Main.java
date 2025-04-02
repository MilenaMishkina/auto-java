package practice_9.Stream_API_Grouping.task_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three");

        Map<Character, List<String>> grouped = strings.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(grouped);
    }
}
