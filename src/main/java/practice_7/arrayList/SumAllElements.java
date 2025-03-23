package practice_7.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAllElements {
    private ArrayList<Integer> intList;

    public SumAllElements() {
        this.intList = new ArrayList<>();
    }

    public void fillList() {
        System.out.println("Введите желаемое количество элементов в списке:");
        Scanner scanner = new Scanner(System.in);
        int valueAmount = scanner.nextInt();

        System.out.println("Введите до" + valueAmount + "чисел");

        for (int i = 0; i < valueAmount; i++) {
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

    public void sum() {
        int result = 0;
        for (Integer i : intList) {
            result += i;
        }
        System.out.println("Сумма значений в списке равна: " + result);
    }

    public void getList() {
        System.out.println("Список:" + intList);
    }
}
