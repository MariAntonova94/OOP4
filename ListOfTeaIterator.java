package org.example.OOP.seminar4.hw;
import java.util.Iterator;
import java.util.List;

public class ListOfTeaIterator implements Iterator<Tea> {
    private List<Tea> listOfTeaIterable;
    private static int count;

    public ListOfTeaIterator(List<Tea> listOfTeaIterable) {
        count = 0;
        this.listOfTeaIterable = listOfTeaIterable;

    }

    public static void setCount(int count) {
        ListOfTeaIterator.count = count;
    }

    @Override
    public boolean hasNext() {
        return count < listOfTeaIterable.size();
    }

    @Override
    public Tea next() {
        return listOfTeaIterable.get(count++);
    }
}
