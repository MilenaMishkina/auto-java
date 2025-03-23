package practice_7.priorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class IntegerQueue {
    public void addTasks(PriorityQueue<Integer> queue) {
        System.out.println("Добавьте 5 чисел в очередь");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            Integer value = scanner.nextInt();
            queue.add(value);
        }
    }

    public void getTasks(PriorityQueue<Integer> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
