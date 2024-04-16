package by.it_academy.homeworks.lesson20.practice.fintech;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Buffer {
    private BlockingQueue<Transaction> transactions = new ArrayBlockingQueue<>(10);

    public void addTransaction(Transaction transaction) throws InterruptedException {
        transactions.put(transaction);
        System.out.println("We add new transaction: " + transaction);
    }
    public Transaction getTransaction() throws InterruptedException {
        Transaction takeTransaction = transactions.take();
        System.out.println("We take transaction: " + takeTransaction);
        return takeTransaction;
    }
}
