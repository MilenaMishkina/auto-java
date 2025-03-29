package practice_8.Generics.task_1;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setName("Привет");
        System.out.println(stringBox.getname());

        Box<Integer> intBox = new Box<>();
        intBox.setName(42);
        System.out.println(intBox.getname());
    }
}
