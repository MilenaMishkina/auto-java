package practice_9.Stream_API_Grouping.task_2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 10, 9, 8, 7, 6);

        Map<Boolean, List<Integer>> map = numbers.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0));

        System.out.println(map);
    }
}
