package by.it_academy.homeworks.lesson15.homework15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
                /**Если выполнить в таком порядке, то будет отображение цифр в порядке увеличения,
                 *  а при каждой цифре буквы в порядке уменьшения
                 .sorted((e1,e2)->e2.substring(0).compareTo(e1.substring(0)))
                 .sorted(Comparator.comparingInt(el -> Integer.valueOf(el.substring(1))))
                 */
                .sorted(Comparator.comparingInt(el -> Integer.valueOf(el.substring(1))))
                .sorted((e1, e2) -> e2.substring(0).compareTo(e1.substring(0)))
                .toList();

        //● Отбросить первый и последний элемент
        List<String> listWithoutFisrtLastEl = sortedList.stream()
                .limit(sortedList.size() - 1)
                .skip(1)
                .toList();

        //● Привести в uppercase
        List<String> upperCaseList = listWithoutFisrtLastEl.stream()
                .map(el -> el.toUpperCase())
                .toList();

        //● Выдать на печать результат
        upperCaseList.stream()
                .forEach(el -> System.out.print(el + " "));

        //● Напечатать количество оставшихся элементов
        System.out.println("\nQuantity of elements = " + upperCaseList.size());

    }
}
