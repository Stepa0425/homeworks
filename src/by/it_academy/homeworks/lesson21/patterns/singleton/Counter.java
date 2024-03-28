package by.it_academy.homeworks.lesson21.patterns.singleton;

public class Counter {
    private static Counter instance;
    private int count;
    // Private constructor to prevent instantiation from outside
    private Counter() {
        count = 0;
    }
    // Public static method to get the instance
    public static synchronized Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }
    public synchronized void increment() {
        count++;
    }
    public synchronized int getCount() {
        return count;
    }
}