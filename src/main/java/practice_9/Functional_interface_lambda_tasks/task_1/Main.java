package practice_9.Functional_interface_lambda_tasks.task_1;

public class Main {
    public static void main(String[] args) {
        MathOperation sum = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println(sum.operate(6, 2));
        System.out.println(subtract.operate(6, 2));
        System.out.println(multiply.operate(6, 2));
        System.out.println(divide.operate(6, 2));
    }

}
