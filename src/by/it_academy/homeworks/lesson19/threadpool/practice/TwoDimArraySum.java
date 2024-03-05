package by.it_academy.homeworks.lesson19.threadpool.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TwoDimArraySum {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = calculateArraySum(array);
        System.out.println("Sum of all elements in the array: " + sum);
    }

    public static int calculateArraySum(int[][] array) {
        AtomicInteger result = new AtomicInteger();

        try (ExecutorService executor = Executors.newFixedThreadPool(array.length)) {
            for (int[] row : array) {
                executor.execute(() -> {
                    int sum = 0;
                    for (int i : row) {
                        sum = sum + i;
                    }
                    result.addAndGet(sum);
                    System.out.println("Row elements sum = " + sum);
                });
            }
        }

        return result.get();
    }
}

