package practice_9.Functional_interface_lambda_tasks.task_4;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> str = s -> s.length();

        System.out.println(str.apply("ABCD"));
    }
}
