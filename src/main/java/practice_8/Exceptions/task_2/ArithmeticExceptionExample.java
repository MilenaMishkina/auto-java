package practice_8.Exceptions.task_2;

public class ArithmeticExceptionExample {
    public void division(Integer A, Integer B) {
        try {
            int result = A / B;
            System.out.println("Результат деления " + A + " на " + B + ": " + result);
    } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
    }


    public static void main(String[] args) {
        ArithmeticExceptionExample test = new ArithmeticExceptionExample();
        test.division(10, 2);
        test.division(10, 0);
    }
}
