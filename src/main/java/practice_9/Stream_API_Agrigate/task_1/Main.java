package practice_9.Stream_API_Agrigate.task_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3);

            Integer max = numbers.stream()
                    .max(Comparator.naturalOrder())
                    .get();
            System.out.println(max);
    }
}
