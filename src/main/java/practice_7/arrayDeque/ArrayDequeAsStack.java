package practice_7.arrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeAsStack {
    private ArrayDeque<Integer> deque;

    public ArrayDequeAsStack() {
        this.deque = new ArrayDeque<>();
    }

    public void addTasks() {
        System.out.println("Введите желаемое количество элементов");
        Scanner scanner = new Scanner(System.in);
        int valueAmount = scanner.nextInt();

        System.out.println("Добавьте элементы в очередь: ");
        for (int i = 1; i <= valueAmount; i++) {
            Integer value = scanner.nextInt();
            deque.push(value);
        }
    }

    public void getTasks() {
        while(!deque.isEmpty()) {
            System.out.println("Значение: " + deque.poll() + " извлечено");
        }
    }
}
