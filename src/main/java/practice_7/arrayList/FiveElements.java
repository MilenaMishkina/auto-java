package practice_7.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FiveElements {
    private ArrayList<Integer> intList;

    public FiveElements() {
        this.intList = new ArrayList<>(5);
    }

    public void fillList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 чисел: ");

        for (int i = 0; i < 5; i++) {
            try {
                int number = scanner.nextInt();
                intList.add(number);
            } catch (Exception e) {
                System.out.println("Ошибка: введите целое число");
                scanner.next();
                i--;
            }
        }
    }

    public void add(int value) {
        System.out.println("Добавляю значение: " + value + " в конец списка");
        intList.add(value);
    }

    public void getList() {
        System.out.println("Список: " + intList);
    }
}
