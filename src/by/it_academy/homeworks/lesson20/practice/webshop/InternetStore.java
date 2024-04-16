package by.it_academy.homeworks.lesson20.practice.webshop;

import java.util.Random;

public class InternetStore implements Runnable {
    private Storage storage;

    public InternetStore(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            storage.take();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("An exception occurred during saving. Message: + " + e.getMessage());
                throw new RuntimeException(e);
            }
        }

    }
}
