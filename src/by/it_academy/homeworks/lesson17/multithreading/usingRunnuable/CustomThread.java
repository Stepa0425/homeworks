package by.it_academy.homeworks.lesson17.multithreading.usingRunnuable;

public class CustomThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello world from new Thread!");
    }
}
