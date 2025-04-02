package practice_9.Stream_API.task_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "two", "three-3", "four-4", "seven-7");

        List<Integer> stringLen = strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(stringLen);
    }
}
