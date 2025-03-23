package practice_7.arrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeAsStack {

    public void addTasks(ArrayDeque<Integer> dequeue) {
        System.out.println("Введите желаемое число элементов: ");
        Scanner scanner = new Scanner(System.in);
        int valuesAmount = scanner.nextInt();

        System.out.println("Добавьте элементы в очередь: ");
        for (int i = 1; i <= valuesAmount; i++) {
            Integer value = scanner.nextInt();
            dequeue.push(value);
        }
    }

    public void getTasks(ArrayDeque<Integer> dequeue) {
        while (!dequeue.isEmpty()) {
            System.out.println("Значение: " + dequeue.pop() + " добавлено");
        }
    }
}
