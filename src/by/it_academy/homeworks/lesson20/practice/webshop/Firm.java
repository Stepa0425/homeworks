package by.it_academy.homeworks.lesson20.practice.webshop;

import java.util.Random;
import java.util.concurrent.TransferQueue;

public class Firm implements Runnable {
    private Storage storage;
    private Random random = new Random();

    public Firm(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            try {
                storage.put(new Order("Store Order: ", random.nextInt(1000)));
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("An exception occurred during order create. Message: + " + e.getMessage());
                throw new RuntimeException(e);
            }
        }

    }
}
