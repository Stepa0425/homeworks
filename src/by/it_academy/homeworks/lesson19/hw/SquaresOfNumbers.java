package by.it_academy.homeworks.lesson19.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;

public class SquaresOfNumbers {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int N = 5;

        List<Integer> randomNumber = new ArrayList<>();
        List<Double> squaresNumbers = new ArrayList<>();
        List<CompletableFuture<Integer>> completableFutureList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> random.nextInt(100));
            completableFutureList.add(completableFuture);
        }

        for (CompletableFuture<Integer> future : completableFutureList) {
            randomNumber.add(future.get());
            squaresNumbers.add(Math.pow(future.get(), 2));
        }

        System.out.println(randomNumber);
        System.out.println(squaresNumbers);

    }
}