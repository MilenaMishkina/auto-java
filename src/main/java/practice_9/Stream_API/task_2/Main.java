package practice_9.Stream_API.task_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 10, 13, 15, 27, 40);

        List<Integer> nums = numbers.stream()
                .filter(x -> x % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(nums);
    }
}
