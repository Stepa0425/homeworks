package by.it_academy.homeworks.lesson14.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Charlie", "Bob");

        // реализация поведения Comparator с помощью анонимного класса
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Anonymous class usage sort result: " + names);

        // перемешаем имена
        Collections.shuffle(names);

        // реализация поведения Comparator с lambda выражений
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Lambda expression usage sort result: " + names);
    }
}