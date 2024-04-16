package by.it_academy.homeworks.lesson17.practice.formula1;

public class Formula1 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Starting pit stop...");
        long startTime = System.currentTimeMillis();
        Thread frontLeftThread = new Thread(() -> replaceWheel(car, "front left"));
        Thread frontRightThread = new Thread(() -> replaceWheel(car, "front right"));
        Thread rearLeftThread = new Thread(() -> replaceWheel(car, "rear left"));
        Thread rearRightThread = new Thread(() -> replaceWheel(car, "rear right"));
        frontLeftThread.start();
        frontRightThread.start();
        rearLeftThread.start();
        rearRightThread.start();
        try {
            frontLeftThread.join();
            frontRightThread.join();
            rearLeftThread.join();
            rearRightThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Pit stop completed in " + (endTime - startTime) + " milliseconds");
    }
    public static void replaceWheel(Car car, String wheelPosition) {
        System.out.println("Replacing " + wheelPosition + " wheel...");
        try {
            Thread.sleep(2000); // Задержка на 2 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(wheelPosition + " wheel replaced.");
    }
}
class Car {
}