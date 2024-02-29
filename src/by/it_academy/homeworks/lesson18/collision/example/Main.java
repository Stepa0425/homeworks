package by.it_academy.homeworks.lesson18.collision.example;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Создаем и запускаем несколько потоков, которые будут увеличивать счетчик
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    counter.increment();
                }
            });
            thread.start();
        }

        // Ждем завершения работы всех потоков
        try {
            Thread.sleep(2000); // Даем потокам время для выполнения
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Выводим значение счетчика
        System.out.println("Final count: " + counter.getCount());
    }
}

class Counter {
    private int count;

    public void increment() {
        try {
            Thread.sleep(1);
        } catch (Exception e) {}

        count++;
    }

    public int getCount() {
        return count;
    }
}