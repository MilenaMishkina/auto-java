package practice_9.Functional_interface_lambda_tasks.task_2;

public class Main {
    public static void main(String[] args) {
       Runnable anonymousClass = new Runnable() {
           @Override
           public void run() {
               System.out.println("Hello from anonymous cass!");
           }
       };
       anonymousClass.run();
    }

}
