package practice_9.Stream_API_Agrigate.task_3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer sumOfValues = numbers.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(sumOfValues);
    }
}
