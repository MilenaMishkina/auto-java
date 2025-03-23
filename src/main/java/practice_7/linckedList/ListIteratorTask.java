package practice_7.linckedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorTask {
    LinkedList<String> listOfValues;
    ListIterator<String> iterator;

    public ListIteratorTask() {
        this.listOfValues = new LinkedList<>(Arrays.asList("A", "B", "C"));
        this.iterator = listOfValues.listIterator();
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