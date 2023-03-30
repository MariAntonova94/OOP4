package org.example.OOP.seminar4.hw;

import org.example.OOP.seminar4.hw.Product;

public class Tea extends Product {

    private int weight;
    private String color;

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Tea(String name, int weight, String color) {
        super(name);
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Чай %s,  %d мл, с окрасом %s", super.getName(), weight, color);
    }
}
