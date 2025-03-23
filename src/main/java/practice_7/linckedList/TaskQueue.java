package practice_7.linckedList;

import java.util.LinkedList;

public class TaskQueue {
    LinkedList<String> tasksList;

    public TaskQueue() {
        this.tasksList = new LinkedList<>();
    }

    public void getTasksList() {
        System.out.println("Очередь задач:" + tasksList);
    }

    public void addTasks() {
        for (int i = 1; i <= 3; i++) {
            tasksList.add("Задача №" + i);
        }
    }

    public void processQueue() {
        while (!tasksList.isEmpty()) {
            String task = tasksList.poll();
            System.out.println("Обработка задачи: " + task);
            System.out.println("Задача обработана");
        }

        System.out.println("Все задачи обработаны. Очередь пуста.");
    }

}
