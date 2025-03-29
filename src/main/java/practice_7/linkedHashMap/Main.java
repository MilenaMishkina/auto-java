package practice_7.linkedHashMap;

public class Main {
    public static void main(String[] args) {
        UserHistory history = new UserHistory();
        history.getHistory();

        history.addPage("1", "One");
        history.addPage("2", "Two");
        history.addPage("3", "Three");
        history.addPage("4", "Four");
        history.addPage("5", "Five");
        history.addPage("6", "Six");
        history.addPage("7", "Seven");
        history.addPage("8", "Eight");
        history.addPage("9", "Nine");
        history.addPage("10", "Ten");

        history.getHistory();

        history.addPage("11", "Eleven");
        history.getHistory();
    }
    }
