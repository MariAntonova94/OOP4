package org.example.OOP.seminar4.hw;

import org.example.OOP.seminar4.hw.Tea;
import org.example.OOP.seminar4.hw.ListOfTeaIterator;

import java.util.Iterator;
import java.util.List;

public class ListOfTea implements Iterable<Tea>{
    private List<Tea> listTea;

    public List<Tea> getListTea() {
        return listTea;
    }

    public void setListTea(List<Tea> listTea) {
        this.listTea = listTea;
    }

    @Override
    public Iterator<Tea> iterator() {
        return new ListOfTeaIterator(listTea);
    }
}
