package by.it_academy.homeworks.lesson14.functionalInteface.supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Supplier для генерации случайного числа
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);
        int randomNumber = randomSupplier.get();
        System.out.println("Random number: " + randomNumber);
        // Supplier для предоставления текущего времени в миллисекундах
        Supplier<Long> currentTimeMillisSupplier = () -> System.currentTimeMillis();
        long currentTimeMillis = currentTimeMillisSupplier.get();
        System.out.println("Current time in milliseconds: " + currentTimeMillis);
    }
}