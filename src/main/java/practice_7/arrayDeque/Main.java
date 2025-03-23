package practice_7.arrayDeque;


import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDequeAsStack stack = new ArrayDequeAsStack();

        ArrayDeque<Integer> test = new ArrayDeque<>();

        stack.getTasks(test);
        stack.addTasks(test);
        stack.getTasks(test);
    }
}
