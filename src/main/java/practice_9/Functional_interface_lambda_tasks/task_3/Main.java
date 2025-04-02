package practice_9.Functional_interface_lambda_tasks.task_3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEvenNum = x -> x % 2 == 0;

        System.out.println(isEvenNum.test(5));
        System.out.println(isEvenNum.test(8));
    }

    }
