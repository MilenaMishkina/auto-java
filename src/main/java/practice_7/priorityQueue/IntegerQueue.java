package practice_7.priorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class IntegerQueue {
    private PriorityQueue<Integer> queue;

    public IntegerQueue() {
        this.queue = new PriorityQueue<>(5);
    }

    public void addTasks() {
        System.out.println("Добавьте 5 задач в очередь");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            Integer task = scanner.nextInt();
            queue.add(task);
        }
    }

    public void getTasks() {
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
