package practice_7.linckedList;

public class Main {
    public static void main(String[] args) {

        TaskQueue tasksList = new TaskQueue();

        tasksList.getTasksList();
        tasksList.processQueue();

        tasksList.addTasks();
        tasksList.processQueue();


        ListIteratorTask list = new ListIteratorTask();
        list.iterateNext();
        list.iteratePrevious();
    }
}
