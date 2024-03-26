package by.it_academy.homeworks.lesson18.collision.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskTest {
    public static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> arrayInt = new ArrayList<>();
        int length = random.nextInt(20);

        for (int i = 0; i < length; i++) {
            arrayInt.add(random.nextInt(1000));
        }
        System.out.println(arrayInt);

        GetMinOrMaxThread maxThread = new GetMinOrMaxThread(arrayInt, 1);
        GetMinOrMaxThread minThread = new GetMinOrMaxThread(arrayInt, 0);

        maxThread.start();
        minThread.start();

        try {
            maxThread.join();
            minThread.join();

            System.out.println("Max element of array = " + maxThread.getFindNumber().orElse(0));
            System.out.println("Min element of array = " + minThread.getFindNumber().orElse(0));
        } catch (Exception e) {
            System.out.println("Exception with " + e.getMessage() + " = is thrown.");
            throw new RuntimeException("U have exception(");
        }
    }
}
