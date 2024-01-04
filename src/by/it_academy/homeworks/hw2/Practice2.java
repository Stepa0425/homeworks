package by.it_academy.homeworks.hw2;

import java.sql.Time;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        printMiddleNumber(a, b, c);
        printDate(a);


    }

    public static void printMiddleNumber(int first, int second, int third) {
        if ((first > second) && (first < third)) {
            System.out.println("The middle number is " + first);
        } else if ((second > first) && (second < third)) {
            System.out.println("The middle number is " + second);
        } else if ((third > second) && (third < first)) {
            System.out.println("The middle number is " + third);
        }
    }

    public static void printOddOrEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even");
        } else {
            System.out.println("The number " + number + " is odd");
        }
    }

    public static String getNameOfFinger(int numberOfFinger) {
        String nameFinger = switch (numberOfFinger) {
            case 1 -> "It's thumb";
            case 2 -> "It's index";
            case 3 -> "It's middle";
            case 4 -> "It's ring";
            case 5 -> "It's pinkie";
            default -> "There is no such finger";
        };
        return nameFinger;
    }
    public static String getNameOfDay(int numberOfDay) {
        String nameDay = switch (numberOfDay) {
            case 1 -> "It's Monday";
            case 2 -> "It's Tuesday";
            case 3 -> "It's Wednesday";
            case 4 -> "It's Thurday";
            case 5 -> "It's Friday";
            case 6 -> "It's Saturday";
            case 7 -> "It's Sunday";
            default -> "There is no such day";
        };
        return nameDay;
    }
    public static void printDate(int seconds) {
        int day = seconds / (60 * 60 * 24);
        int hour = (seconds / (60 * 60)) % 24;
        int min = (seconds / 60) % 60;
        int sec = seconds % 60;
        printTimeUnit(day, "day");
        printTimeUnit(hour, "hour");
        printTimeUnit(min, "minute");
        printTimeUnit(sec, "second");
    }

    public static void printTimeUnit(int number, String timeUnitName) {
        if (number != 0) {
            if (number != 1) {
                System.out.print(number + " " + timeUnitName + "s ");
            } else {
                System.out.print(number + " " + timeUnitName + " ");
            }
        }
    }

    public static void printNextDay(int dateDay, int dateMonth, int dateYear) {
        if (dateDay > 29) {
            dateMonth++;
            dateDay = 1;
        } else {
            dateDay = dateDay + 1;
        }
        if (dateMonth > 11) {
            dateMonth = 1;
            dateYear++;
        }
        System.out.println("The next day : " + dateDay + " " + dateMonth + " " + dateYear);
    }

}
