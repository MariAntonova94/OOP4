package org.example.OOP.seminar4.hw;

public class Coffee extends Product {

    private int age;

    @Override
    public String toString() {
        return "Кофе " +
                "'" + super.getName() + '\'' +
                ", дней после обжарки =" + age +
                '.';
    }

    public Coffee(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
