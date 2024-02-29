package by.it_academy.homeworks.lesson17.multithreading.waitingThread;

import by.it_academy.homeworks.lesson17.multithreading.usingRunnuable.CustomThread;

public class Main {
    public static void main(String[] args) {
        CustomThread helloRunnable = new CustomThread();
        Thread thread = new Thread(helloRunnable);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
