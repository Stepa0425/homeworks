package by.it_academy.homeworks.lesson19.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/*Создайте матрицу размера n*m. Создайте два потока, один из которых перемножает все значения в столбцах и потом находит сумму,
 а другой поток перемножает все значения в строках и тоже потом находит сумму. Определите какое число больше
 ПО 1С))))*/
public class Task1 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        calculateMultiplying(array);
    }

    public static void calculateMultiplying(int[][] array) {
        AtomicInteger resultOfRows = new AtomicInteger();
        AtomicInteger resultOfColumns = new AtomicInteger();
        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {
            executor.execute(() -> {
                for (int i = 0; i < array.length; i++) {
                    int myltiplying = 1;
                    for (int j = 0; j < array[i].length; j++) {
                        myltiplying *= array[i][j];
                    }
                    resultOfRows.addAndGet(myltiplying);
                    System.out.println("Row elements myltiplying = " + myltiplying);
                }
            });

            executor.execute(() -> {
                for (int j = 0; j < array[0].length; j++) {
                    int myltiplying = 1;
                    for (int i = 0; i < array.length; i++) {
                        myltiplying *= array[i][j];
                    }
                    resultOfColumns.addAndGet(myltiplying);
                    System.out.println("Column elements myltiplying = " + myltiplying);
                }
            });
        }

        System.out.println("\nSum multiplication columns = " + resultOfColumns);
        System.out.println("Sum multiplication rows = " + resultOfRows);
        if (resultOfColumns.get() > resultOfRows.get()) {
            System.out.println("Sum multiplication columns > Sum multiplication rows");
        } else {
            System.out.println("Sum multiplication rows > Sum multiplication columns");
        }
    }
}
