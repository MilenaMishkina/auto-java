package practice_7.treeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class AddUniqueNumbers {

    public void addNumbers(TreeSet<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемое количество значений в списке: ");
        int numsAmount = scanner.nextInt();

        while (list.size() < numsAmount) {
            System.out.println("Введите значение: ");
            int newValue = scanner.nextInt();

            if(list.contains(newValue)) {
                System.out.println("Значение: " + newValue+ " уже добавлено в список.");
            } else {
                list.add(newValue);
                System.out.println("Значение: " + newValue + " добавлено в список");
            }
        }
        System.out.println("Итоговый список: "+ list) ;
    }
}
