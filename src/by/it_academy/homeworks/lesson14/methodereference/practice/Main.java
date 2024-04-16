package by.it_academy.homeworks.lesson14.methodereference.practice;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Пример ссылки на статический метод
        Consumer<String> consumer1 = Message::printMessage;
        consumer1.accept("Hello, world!");

        // Пример ссылки на метод экземпляра
        Message someMessage = new Message();
        Supplier<String> supplier = someMessage::getMessage;
        System.out.println(supplier.get());
    }
}
