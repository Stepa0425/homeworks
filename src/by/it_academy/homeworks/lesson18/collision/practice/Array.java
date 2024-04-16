package by.it_academy.homeworks.lesson18.collision.practice;

import java.util.concurrent.atomic.AtomicInteger;

public class Array {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        AtomicInteger finalSum = new AtomicInteger();
        for (int i = 0; i < array.length; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                int sum = 0;
                int [] currentRow = array[finalI];
                for (int j = 0; j < array[finalI].length; j++)
                {
                    sum = sum + currentRow[j];

                }
                finalSum.addAndGet(sum);
                System.out.println("Row elements sum = " + sum);
            });
            thread.start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final sum = " + finalSum.get());
    }
}