package by.it_academy.homeworks.hw11.Practice;

import java.util.ArrayList;
import java.util.Collection;

public class Main2 {
    public static void main(String[] args) {
        //об ArrayList поговорим чуть позже
        Collection<Integer> integerCollection = new ArrayList<>();

        integerCollection.add(10);
        integerCollection.add(25);
        integerCollection.add(99);

        Collection<Integer> anotherIntegerCollection = new ArrayList<>();
        //Is integerCollection equal to anotherIntegerCollection? - false
        System.out.println(
                "Is integerCollection equal to anotherIntegerCollection? - "
                        + integerCollection.equals(anotherIntegerCollection)
        );

        //Is integerCollection empty? - false
        System.out.println("Is integerCollection empty? - " + integerCollection.isEmpty());

        //integerCollection size = 3
        System.out.println("integerCollection size = " + integerCollection.size());

    }
}
