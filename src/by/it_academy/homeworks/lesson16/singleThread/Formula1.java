package by.it_academy.homeworks.lesson16.singleThread;

public class Formula1 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Starting pit stop...");
        long startTime = System.currentTimeMillis();

        replaceWheel(car, "front left");
        replaceWheel(car, "front right");
        replaceWheel(car, "rear right");
        replaceWheel(car, "rear left");

        long endTime = System.currentTimeMillis();

        System.out.println("Pit stop is completed in " + (endTime - startTime) + " milliseconds.");
    }

    public static void replaceWheel(Car car, String wheelPosition) {
        System.out.println("Replacing " + wheelPosition + " wheel...");
        try {
            //Имитация задержки на замену колеса
            Thread.sleep(2000);//Задержка на 2 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(wheelPosition + " wheel replaced.");

    }
}

class Car {

}
