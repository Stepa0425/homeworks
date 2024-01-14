package by.it_academy.homeworks.hw2;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double xCircle = scanCoordinate("x-coordinate", "circle");
        double yCircle = scanCoordinate("y-coordinate", "circle");
        double radius = scanRadius();
        double xPoint = scanCoordinate("x-coordinate", "point");
        double yPoint = scanCoordinate("y-coordinate", "point");
        printIsOutsidePoint(xCircle, yCircle, radius, xPoint, yPoint);
    }

    public static double scanCoordinate(String nameCoordinate, String ownerCoordinate) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Enter the " + nameCoordinate + " of the " + ownerCoordinate + ":");
        return sc.nextDouble();
    }

    public static double scanRadius(){
        double coordinate = scanCoordinate("radius", "circle");
        if (coordinate < 0) {
            System.out.println("Enter a valid value!");
            return scanRadius();
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
