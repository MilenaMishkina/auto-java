package practice_7.linckedHashSet;

import java.util.LinkedHashSet;

public class UniqueSet {

    public void addUnique(LinkedHashSet<String> set, String element) {
        if(!set.contains(element)) {
            System.out.println("Элемент: " + element + " добавлен в список");
            set.add(element);
        } else {
            System.out.println("Элемент: " + element + " уже существует в списке");
        }
    }
}
