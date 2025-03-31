package practice_8.Generics.task_1;

public class Box<T> {
    private T name;

    public T getName() {
        return this.name;
    }

    public void setName(T newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        System.out.println(stringBox.getName());
        stringBox.setName("Box");
        System.out.println(stringBox.getName());

        Box<Integer> intBox = new Box<>();
        System.out.println(intBox.getName());
        intBox.setName(100);
        System.out.println(intBox.getName());
    }
}
