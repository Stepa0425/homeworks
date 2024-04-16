package by.it_academy.homeworks.lesson20.producer.consumer.example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(5);
    private void produce() {
        for (int i = 0; i < 3; i++) {
            try {
                int value = (int) (Math.random() * 100);
                blockingQueue.put(value);
                System.out.println(Thread.currentThread().getName() + " Value produced: " + value);
            } catch (InterruptedException e) {
                System.out.println("Exception while calling produce()");
                break;
            }
        }
    }
    private void consume() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " Value Consumed: " + blockingQueue.take());
            } catch (InterruptedException e) {
                System.out.println("Exception while calling consume()");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Main example = new Main();

        for (int i = 0; i < 2; i++) {
            Thread producerThread = new Thread(example::produce);
            producerThread.start();
        }

        for (int i = 0; i < 3; i++) {
            Thread consumerThread = new Thread(example::consume);
            consumerThread.start();
        }

        System.exit(0);
    }
}