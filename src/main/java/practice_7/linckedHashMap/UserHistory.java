package practice_7.linckedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UserHistory {
    private final LinkedHashMap<String, String> history = new LinkedHashMap<String, String>(10);

    public void addPage(String pageId, String pageName) {
        if (history.size() >= 10) {
            history.remove(history.pollFirstEntry().getKey());
        }
        history.put(pageId, pageName);
    }

    public void getHistory(LinkedHashMap<String, String> history) {
        System.out.println("История просмотров (от старых к новым):");
        for (Map.Entry<String, String> entry : history.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Название: " + entry.getValue());
        }

    }
}
