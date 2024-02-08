package by.it_academy.homeworks.hw11.Practice;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        //об ArrayList поговорим чуть позже
        Collection<String> stringCollection = new ArrayList<>();

        stringCollection.add("1st collection element");
        stringCollection.add("2nd collection element");

        //Collection contains: [1st collection element, 2nd collection element]
        System.out.println("Collection contains: " + stringCollection);

        stringCollection.remove("1st collection element");
        //After 1st element removal collection contains: [2nd collection element]
        System.out.println("After 1st element removal collection contains: " + stringCollection);

        stringCollection.clear();
        //After clear collection contains: []
        System.out.println("After clear collection contains: " + stringCollection);
    }
}
