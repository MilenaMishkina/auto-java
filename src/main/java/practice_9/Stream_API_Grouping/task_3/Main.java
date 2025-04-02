package practice_9.Stream_API_Grouping.task_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Double number = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(number);
    }
}
