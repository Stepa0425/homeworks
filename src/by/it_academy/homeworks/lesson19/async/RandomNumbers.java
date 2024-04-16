package by.it_academy.homeworks.lesson19.async;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RandomNumbers {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int N = 5;

        List<Integer> randomNumber = new ArrayList<>();
        List<CompletableFuture<Integer>> completableFutureList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> random.nextInt(100));
            completableFutureList.add(completableFuture);
        }

        /*for (CompletableFuture<Integer> future : completableFutureList){
            System.out.print(future.get()+"\t");
        }*/
        for (CompletableFuture<Integer> future : completableFutureList) {
            randomNumber.add(future.get());
        }

        System.out.println(randomNumber);

    }
}
