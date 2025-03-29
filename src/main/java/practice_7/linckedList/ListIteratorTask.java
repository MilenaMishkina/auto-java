package practice_7.linckedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorTask {
    private LinkedList<String> list;
    private ListIterator<String> iterator;

    public ListIteratorTask() {
        this.list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        this.iterator = list.listIterator();
    }

    public void iterateNext() {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void iteratePrevious() {
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
