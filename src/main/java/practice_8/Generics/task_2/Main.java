package practice_8.Generics.task_2;

public class Main {
    public static void main(String[] args) {
        GenericMethod method = new GenericMethod();

        String[] stringArray = {"Hello", "World"};
        method.genericMethod(stringArray);

        Integer[] intArray = {1, 2, 3};
        method.genericMethod(intArray);
    }
}
