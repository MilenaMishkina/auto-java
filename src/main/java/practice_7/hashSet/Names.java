package practice_7.hashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Names {
    HashSet<String> names;
     public Names() {
         this.names = new HashSet<>();
     }

     public void getNames() {
         System.out.println("Список имен: " + names);
     }

     public void addNames() {
         System.out.println("Введите жедаемое количество имен для добавления:");
         Scanner scaner = new Scanner(System.in);
         int namesAmount = scaner.nextInt();

         System.out.println("Введите имена в количестве: " + namesAmount);
         for(int i = 1; i <= namesAmount; i++) {
            String name = scaner.next();
             names.add(name);
         }
     }

     public void checkNameContainsInList(String expectedName) {
         if (names.contains(expectedName)) {
             System.out.println("Имя: " + expectedName + " содержится в списке");
         } else {
             System.out.println("Имя: " + expectedName + " не содержится в списке");
         }
     }
}
