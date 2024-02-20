package by.it_academy.homeworks.lesson14.functionalInteface.consumer;

import java.util.function.Consumer;
public class Main {
    public static void main(String[] args) {
        // Consumer для вывода строки на консоль
        Consumer<String> printConsumer = s -> System.out.println(s);
        printConsumer.accept("Hello, world!");
        // Consumer для удвоения числа
        Consumer<Integer> doubleConsumer = n -> System.out.println(n * 2);
        doubleConsumer.accept(5);
    }
}

