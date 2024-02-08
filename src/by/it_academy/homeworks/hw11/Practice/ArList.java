package by.it_academy.homeworks.hw11.Practice;

import java.util.ArrayList;
import java.util.List;

public class ArList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //  List<String> list = new LinkedList<>(); можно легко подменить реализацию списка

        list.add("Berlin");
        list.add("Tokyo");
        //Cities: [Berlin, Tokyo]
        System.out.println("Cities: " + list);

        list.add(1, "Barcelona");
        list.add(3, "Minsk");
        //Cities: [Berlin, Barcelona, Tokyo, Minsk]
        System.out.println("Cities: " + list);

        list.remove(2);
        //Cities: [Berlin, Barcelona, Minsk]
        System.out.println("Cities: " + list);
        //First city is Berlin
        System.out.println("First city is " + list.get(0));
        //All cities size: 3
        System.out.println("All cities size: " + list.size());
    }
}
