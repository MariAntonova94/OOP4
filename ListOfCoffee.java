package org.example.OOP.seminar4.hw;


import java.util.Iterator;
import java.util.List;

public class ListOfCoffee implements Iterable<Coffee> {
    List<Coffee> coffeeList;
    private int countCoffee;

    public void setListCoffee(List<Coffee> listCoffee) {
        this.coffeeList = listCoffee;
    }
    public List<Coffee> getListCoffee() {
        return coffeeList;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return coffeeList.iterator();
    }
}
