package practice_8.Generics.task_3;

public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Masha", 20);
        System.out.println("Первый элемент: " + pair.getFirst());
        System.out.println("Второй элемент: " + pair.getSecond());

        pair.setFirst("Новое значение");
        pair.setSecond(100);
        System.out.println("После изменения:");
        System.out.println("Первый элемент: " + pair.getFirst());
        System.out.println("Второй элемент: " + pair.getSecond());
    }
}
