package org.example.OOP.seminar4.hw;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListOfTea listTea = new ListOfTea();
        listTea.setListTea(Arrays.asList(
                new Tea("С Чебрецом",300, "Черный."),
                new Tea("С Клубникой", 900, "Красный."),
                new Tea("Зеленый", 250, "Зеленый.")));
        ListOfCoffee listOfCoffee = new ListOfCoffee();
        listOfCoffee.setListCoffee(Arrays.asList
                (new Coffee("Арабика", 6), new Coffee("Робуста", 15),(new Coffee("Либерика", 25))));

//        System.out.println("--------Перебор итератором--------");
//        Iterator<Tea> iter = listTea.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }



        System.out.println("\n--------Сортировка через класс ComparableOfNameTea по имени Tea--------");
        listTea.getListTea().sort(new ComparableOfNameTea());
        for (Tea tea: listTea){
            System.out.println(tea);
        }
        System.out.println("\n--------Сортировка через класс ComparableOfNameTaa по имени Coffee--------");
        listOfCoffee.getListCoffee().sort(new ComparableOfNameTea());
        for (Coffee coffee: listOfCoffee){
            System.out.println(coffee);
        }




//        ListOfTeaIterator.setCount(0);
//
//        System.out.println("\n--------Сортировка через ссылку на метод по цвету--------");
//        listTea.getListTea().sort(Comparator.comparing(Tea::getColor));
//        listTea.forEach(System.out::println);
//        ListOfTeaIterator.setCount(0);

//        System.out.println("\n--------Сортировка через анонимный класс по весу--------");
//        listTea.getListTea().sort(new Comparator<>() {
//            @Override
//            public int compare(Tea tea1, Tea tea2) {
//                return Integer.compare(tea1.getWeight(), tea2.getWeight());
//            }
//        });
//        listTea.forEach(System.out::println);
    }
}
