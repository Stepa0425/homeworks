package by.it_academy.homeworks.lesson20.practice.fintech;

import java.util.Random;
import java.util.UUID;

public class MobileApp implements Runnable {
    public Buffer buffer;

    private Random random = new Random();

    public MobileApp(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.addTransaction(new Transaction(random.nextInt(1000), UUID.randomUUID(), TypeOfTransaction.COMMISSION));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
