package by.it_academy.homeworks.hw2;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int seconds = getRandomNumberSeconds();
        System.out.println("The are " + seconds + " seconds left until the end.");
        printTimeUntilTheEnd(seconds);
    }

    public static int getRandomNumberSeconds() {
        Random random = new Random();
        return random.nextInt(28800);
    }

    public static void printTimeUntilTheEnd(int seconds) {
        int hours = seconds / 3600;
        String timeToEnd = switch (hours) {
            case 2, 3, 4, 5, 6, 7, 8 -> "There are " + hours + " hours left until the end.";
            case 1 -> "There is " + hours + " hour left until the end.";
            case 0 -> "Less than an hour left until the end.";
            default -> "There's still a little bit left until the end.";
        };
        System.out.println(timeToEnd);
    }
}
