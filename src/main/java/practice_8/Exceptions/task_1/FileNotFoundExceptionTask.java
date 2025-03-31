package practice_8.Exceptions.task_1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionTask {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/main/java/practice_8/Exceptions/task_1/data.txt");
            System.out.println("Файл " + file + " успещно открыт") ;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден") ;
        }
    }
}
