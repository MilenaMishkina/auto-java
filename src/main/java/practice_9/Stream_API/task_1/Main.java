package practice_9.Stream_API.task_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "two", "three-3", "four-4", "seven-7");

        String streamString = String.valueOf(strings.stream()
                                .filter(s -> s.length() > 5)
                                .collect(Collectors.toList()));
        System.out.println(streamString);
    }
}
