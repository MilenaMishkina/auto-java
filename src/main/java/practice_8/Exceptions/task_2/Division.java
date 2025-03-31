package practice_8.Exceptions.task_2;

public class Division {

    public void division(Integer A, Integer B) {
        try {
            System.out.println("Результат деления " + A + " на " + B + ": " + A/B);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
    }
}
