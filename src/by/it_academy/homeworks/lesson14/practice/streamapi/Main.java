package by.it_academy.homeworks.lesson14.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Stream<String> stream = names.stream();



        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();



        System.out.println(filteredNames);

    }
}