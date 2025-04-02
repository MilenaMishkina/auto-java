package practice_9.Stream_API.task_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 198);

        List<Integer> squareNums = numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(squareNums);
    }

}
