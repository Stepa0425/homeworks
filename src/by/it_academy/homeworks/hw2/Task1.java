package by.it_academy.homeworks.hw2;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double xCircle = scannerCoordinate("x-coordinate", "circle");
        double yCircle = scannerCoordinate("y-coordinate", "circle");
        double radius = scannerCoordinate("radius", "circle");
        double xPoint = scannerCoordinate("x-coordinate", "point");
        double yPoint = scannerCoordinate("y-coordinate", "point");
        printIsOutsidePoint(xCircle, yCircle, radius, xPoint, yPoint);
    }

    public static double scannerCoordinate(String nameCoordinate, String ownerCoordinate) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Enter the " + nameCoordinate + " of the " + ownerCoordinate + ":");
        double coordinate = sc.nextDouble();
        if (nameCoordinate.equals("radius") && (coordinate < 0)) {
            System.out.println("Enter a valid value!");
            return scannerCoordinate(nameCoordinate, ownerCoordinate);
        } else return coordinate;
    }

    public static void printIsOutsidePoint(double xCircle, double yCircle, double radius, double xPoint, double yPoint) {
        double distance = Math.sqrt(Math.pow(xPoint - xCircle, 2) + Math.pow(yPoint - yCircle, 2));
        if (distance > radius) {
            System.out.println("The point is outside the circle.");
        } else {
            System.out.println("The point is inside or on the circle.");
        }
    }
}
