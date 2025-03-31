package practice_8.Generics.task_2;

public class GenericMethod {
    public  <T> void genericMethod(T[] array) {
        for (T elemet : array) {
            System.out.println(elemet);
        }
    }
}
