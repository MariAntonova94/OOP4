package org.example.OOP.seminar4.hw;

import org.example.OOP.seminar4.hw.Product;

import java.util.Comparator;

/**
 * Класс сортировки по имени Чая
 */
public class ComparableOfNameTea <T extends Product> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
