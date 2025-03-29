package practice_7.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserHistory {
    private LinkedHashMap<String, String> history;
    public UserHistory() {
        this.history = new LinkedHashMap<>(10);
    }
    public void addPage(String pageId, String pageName) {
        if (history.size() >= 10) {
            history.remove(history.pollFirstEntry().getKey());
        }
        history.put(pageId, pageName);
    }

    public void getHistory() {
        System.out.println("История просмотров: ");
        for(Map.Entry<String, String> entry: history.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ". Название: " + entry.getValue());
        }
    }
}
