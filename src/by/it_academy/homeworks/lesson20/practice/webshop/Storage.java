package by.it_academy.homeworks.lesson20.practice.webshop;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Storage {
    private BlockingQueue<Order> orders = new ArrayBlockingQueue<>(5);

    public void put(Order order) throws InterruptedException {
        orders.put(order);
        System.out.println("We put an order " + order);
    }

    public Order take() {
        Order takeOrder = null;
        try {
            takeOrder = orders.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("We take an order: " + takeOrder);

        return takeOrder;
    }
}
