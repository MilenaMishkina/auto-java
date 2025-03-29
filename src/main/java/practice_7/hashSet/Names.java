package practice_7.hashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Names {

    private HashSet<String> names;
    public Names() {
        this.names = new HashSet<>();
    }

    public void getNames() {
        System.out.println("List of names: " + names);
    }

    public void addNames() {
        System.out.println("Enter how many names do you want to add: ");
        Scanner scanner = new Scanner(System.in);
        int namesAmount = scanner.nextInt();

        System.out.println("Enter names");
        for(int i = 1; i <= namesAmount; i++) {
            String name = scanner.next();
            names.add(name);
        }
    }

    public void checkSetContainsName(String expectedName) {
        if (names.contains(expectedName)) {
            System.out.println("Name: " + expectedName + " contains in names set");
        } else {
            System.out.println("Name: " + expectedName + " is NOT contains in names set");
        }
    }
}
