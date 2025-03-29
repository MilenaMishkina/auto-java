package practice_8.Generics.task_2;

public class Main {
    public static void main(String[] args) {
        GenericMethodExample paramMethod = new GenericMethodExample();

        String[] stringArray = {"Привет"};
        paramMethod.printArray(stringArray);

        Integer[] intArray = {1, 2, 3, 4, 5};
        paramMethod.printArray(intArray);
}
}

