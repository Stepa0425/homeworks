package by.it_academy.homeworks.lesson15.homework15;

import java.net.InterfaceAddress;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
● Удалить все содержащие “3”
● Отсортировать сперва по числу (по возрастанию), потом по
букве (по убыванию)
● Отбросить первый и последний элемент
● Привести в uppercase
● Выдать на печать результат
● Напечатать количество оставшихся элементов*/
public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        //● Удалить все содержащие “3”
        List<String> listWithout3 = myList.stream()
                .filter(el -> el.matches("[^3]+"))
                .toList();

        /*● Отсортировать сперва по числу (по возрастанию), потом по
            букве (по убыванию)*/
        List<String> sortedList = listWithout3.stream()
                /*.sorted((e1,e2)->e2.substring(0).compareTo(e1.substring(0)))
                .sorted(Comparator.comparingInt(el -> Integer.valueOf(el.substring(1))))
                */
                .sorted(Comparator.comparingInt(el -> Integer.valueOf(el.substring(1))))
                .sorted((e1,e2)->e2.substring(0).compareTo(e1.substring(0)))
                .toList();
        System.out.println(sortedList);


        //.sorted((el1, el2) -> el1.substring(0).compareTo(el2.substring(0)))


    }
}
