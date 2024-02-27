package by.it_academy.homeworks.lesson13.practice.filesTasks;


import by.it_academy.homeworks.lesson13.practice.filesTasks.FileReadWriteUtils;

import java.util.Collections;
import java.util.List;

public class Main {
    //создать 2 файла
    //положить в них 50 чисел от 1 до 1000
    //получить числа в виде 2 списков
    //получить единый список
    //отсортировать его
    //записать список в файл
    public static void main(String[] args) {
        final String PATH_TO_FILE_1 = "resources/lesson13/in1.txt";
        final String PATH_TO_FILE_2 = "resources/lesson13/in2.txt";
        final String PATH_TO_RESULT_FILE = "resources/lesson13/out.txt";
        final Integer COUNT_OF_NUMBERS = 50;
        final Integer MAX_VALUE = 1000;

        FileReadWriteUtils.writeRandomNumbers(PATH_TO_FILE_1, COUNT_OF_NUMBERS, MAX_VALUE);
        FileReadWriteUtils.writeRandomNumbers(PATH_TO_FILE_2, COUNT_OF_NUMBERS, MAX_VALUE);

        List<Integer> firstNumbers = FileReadWriteUtils.getNumbersFromFile(PATH_TO_FILE_1);
        List<Integer> secondNumbers = FileReadWriteUtils.getNumbersFromFile(PATH_TO_FILE_2);

        firstNumbers.addAll(secondNumbers);
        Collections.sort(firstNumbers);

        FileReadWriteUtils.writeListToFile(firstNumbers,PATH_TO_RESULT_FILE);
    }


}
