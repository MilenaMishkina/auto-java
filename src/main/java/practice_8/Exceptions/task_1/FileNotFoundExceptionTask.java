package practice_8.Exceptions.task_1;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionTask {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/main/java/practice_8/Exceptions/data.txt");
            System.out.println("Файл " + file + " успешно открыт");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
