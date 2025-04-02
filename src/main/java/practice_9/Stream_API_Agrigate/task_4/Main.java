package practice_9.Stream_API_Agrigate.task_4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1, 2, 3, 4, 5", "Boris", "Борис", "Бобр");

        Optional<String> first = strings.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();

        System.out.println(first);
    }

}
