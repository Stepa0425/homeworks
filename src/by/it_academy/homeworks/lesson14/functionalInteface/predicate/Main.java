package by.it_academy.homeworks.lesson14.functionalInteface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();


        names.add("John");
        names.add("Bob");
        names.add("Charlie");
        // Фильтрация списка по условию длины имени
        Predicate<String> filter = s -> s.length() > 4;
        List<String> filteredNames = filterList(names, filter);
        System.out.println("Filtered names: " + filteredNames);
    }
    public static List<String> filterList(List<String> list, Predicate<String> predicate) {
        List<String> filteredList = new ArrayList<>();
        for (String item : list) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}