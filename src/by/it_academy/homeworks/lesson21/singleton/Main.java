package by.it_academy.homeworks.lesson21.singleton;

public class Main {
    public static void main(String[] args) {
        //Counter counter1 = new Counter();
        Counter counter = Counter.getInstance();

        counter.increment();
        counter.increment();

        //Current count: 2
        System.out.println("Current count: " + counter.getCount());

        Counter anotherCounter = Counter.getInstance();
        //Current count after another getInstance() call: 2
        System.out.println("Current count after another getInstance() call: " + anotherCounter.getCount());
    }
}