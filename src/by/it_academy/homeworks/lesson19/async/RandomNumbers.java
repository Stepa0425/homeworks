package by.it_academy.homeworks.lesson19.async;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class RandomNumbers {
    public static void main(String[] args) {
        int N = 25;

        List<Integer> randomNumber = new ArrayList<>();
        List<CompletableFuture<Integer>> completableFutureList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++){
            CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> random.nextInt());
            completableFutureList.add(completableFuture);
        }

        //у каждого элемента completableFutureList вызвать метод get(), чтобы получить результат

    }
}
