package by.it_academy.homeworks.lesson19.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SquaresOfNumbers {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int N = 5;

        List<Double> squaresNumbers = new ArrayList<>();
        List<CompletableFuture<Double>> completableFutureList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            CompletableFuture<Double> completableFuture = CompletableFuture.supplyAsync(() -> Math.pow(random.nextInt(100), 2));
            completableFutureList.add(completableFuture);
        }

        for (CompletableFuture<Double> future : completableFutureList) {
            squaresNumbers.add(future.get());
        }

        System.out.println(squaresNumbers);

    }
}