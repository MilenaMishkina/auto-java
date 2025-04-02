package practice_9.Functional_interface_lambda_tasks.task_5;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> string = s -> System.out.println(s);
        string.accept("Hello");
    }
}
