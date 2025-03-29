package practice_7.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FiveNames {
    public void addNames(HashMap<String, Integer> namesMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 пар: имя - возраст: ");

        for(int i = 1; i <= 5; i++) {
            String name = scanner.next();
            int age = scanner.nextInt();
            namesMap.put(name, age);
        }
        System.out.println("Итоговый список: " + namesMap);
    }
}
