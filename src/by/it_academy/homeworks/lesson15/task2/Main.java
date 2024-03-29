package by.it_academy.homeworks.lesson15.task2;

import java.util.*;
import java.util.function.Predicate;

/*Дана коллекция Collection<String> col.*/
public class Main {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();

        col.add("Picture Milk");
        col.add("Car ");
        col.add("Banana");
        col.add("Login");
        col.add("Word Port? ");
        col.add("Dog");
        col.add("Cat.");
        col.add("Snake");
        col.add("Socks? Ok");
        col.add("Waffles, ");

        //Есть ли слово Login в col?
        Predicate<String> login = name -> name.contains("Login");
        boolean includeLogin = col.stream()
                .anyMatch(login);
        System.out.println(includeLogin);

        //Найти самую длинную строку
        Optional<String> maxLengthWord = col.stream()
                .max((name1, name2) -> Integer.valueOf(name1.length()).compareTo(name2.length()));
        System.out.println(maxLengthWord);


        /*найти строки-слова (не содержат пробелов и знаков препинания)*/
        List<String> list = col.stream()
                .filter(name -> name.matches("[A-Za-z]+"))
                .toList();
        System.out.println(list);

        /*получить все слова используемые в строках*/

        List<String> wordStrings = col.stream()
                .flatMap(s -> Arrays.stream(s.split("[?,\\s\\.]+")))
                .toList();

        System.out.println("Word strings: " + wordStrings);
    }
}
