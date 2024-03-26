package by.it_academy.homeworks.lesson19.threadpool.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newSingleThreadExecutor()) {
            executor.execute(() -> System.out.println("Hello World"));
            executor.execute(() -> System.out.println("Message!!!"));
        } finally {
            System.out.println("All tasks were executed successfully!");
        }
    }
}
