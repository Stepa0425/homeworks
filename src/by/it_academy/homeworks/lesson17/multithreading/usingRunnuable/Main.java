package by.it_academy.homeworks.lesson17.multithreading.usingRunnuable;

public class Main {
    public static void main(String[] args) {
        CustomThread helloRunnable = new CustomThread();
        Thread thread = new Thread(helloRunnable);
        thread.start();
    }
}
