package practice_7.linckedList;

import java.util.LinkedList;

public class TaskQueue {
    private LinkedList<String> tasksList;

    public TaskQueue() {
        this.tasksList = new LinkedList<>();
    }

    public void getTasksList() {
        System.out.println("Очередь задача: " + tasksList);
    }

    public void addTasks() {
        for (int i = 1; i <= 3; i++) {
            tasksList.add("Звдача № " + i);
        }
    }

    public void processQueue() {
        while (!tasksList.isEmpty()) {
            String task = tasksList.poll();
            System.out.println("Задача " + task + " обработана");
        }
        System.out.println("Все задачи обработаны. Очередь пуста");
    }
}
