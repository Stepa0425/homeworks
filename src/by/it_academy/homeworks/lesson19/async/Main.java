package by.it_academy.homeworks.lesson19.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int number = 5;
        CompletableFuture<Long> completableFuture = CompletableFuture.supplyAsync(() -> factorial(number));

        while (!completableFuture.isDone()) {
            System.out.println("CompletableFuture execution is in progress...");
        }

        long result = completableFuture.get();
        //5! = 120
        System.out.println(number + "! = " + result);
    }

    private static long factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
}