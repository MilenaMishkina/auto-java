package practice_9.Stream_API_Agrigate.task_5;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 10, 20, 50, 100, 145, 168);

        boolean num = numbers.stream()
                .anyMatch(x -> x % 5 == 0);

        System.out.println(num);
    }
}
