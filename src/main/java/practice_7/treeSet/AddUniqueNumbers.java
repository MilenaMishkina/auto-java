package practice_7.treeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class AddUniqueNumbers {

    public void addNumbers(TreeSet<Integer> intSet) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемое количество значений в списке: ");
        int numsAmount = scanner.nextInt();

        while(intSet.size() < numsAmount) {
            System.out.println("Введите значение: ");
            int newValue = scanner.nextInt();

            if(intSet.contains(newValue)) {
                System.out.println("Значение " + newValue + " уже добавлено в список");
            } else {
                intSet.add(newValue);
                System.out.println("Значение " + newValue + " добавлено в список");
            }
        }
        System.out.println("Итоговое множество: " + intSet);
    }
}
