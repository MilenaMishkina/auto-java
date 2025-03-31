package practice_8.Generics.task_3;

public class Pair <T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T item) {
        this.first = item;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair <String, Integer> pair = new Pair<>("Masha", 20);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.setFirst("Dasha");
        pair.setSecond(25);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
