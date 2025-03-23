package practice_7.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FiveMaps {
    public void addNames(HashMap<String, Integer> map) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите 5 пар: имя - возраст: ");
        for(int i = 1; i <= 5; i++) {
            String name = scaner.next();
            int age = scaner.nextInt();
            map.put(name, age);
        }
        System.out.println("Итоговый список: " + map);
    }
}
