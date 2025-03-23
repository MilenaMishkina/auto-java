package practice_7.priorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        IntegerQueue queue = new IntegerQueue();
        PriorityQueue<Integer> queueExample = new PriorityQueue<>();

        queue.getTasks(queueExample);
        queue.addTasks(queueExample);
        queue.getTasks(queueExample);
    }
}
