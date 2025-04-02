package practice_9.Stream_API.task_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 3, 4, 8, 1, 5, 8, 10, 45);

        List<Integer> uniqueNumberList = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueNumberList);
    }
}
