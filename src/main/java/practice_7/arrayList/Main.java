package practice_7.arrayList;

public class Main {
    public static void main(String[] args) {
        ArrayListFiveElements list = new ArrayListFiveElements();
        SumAllElements list2 = new SumAllElements();

        list.getList();
        list.fillList();
        list.add(2);
        list.getList();

        list2.getList();
        list2.fillList();
        list2.sum();

    }
}
