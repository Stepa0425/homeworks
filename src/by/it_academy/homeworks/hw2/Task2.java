package by.it_academy.homeworks.hw2;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the coefficients of the quadratic equation (a,b,c):");
        double a = scannerCoefficient();
        double b = scannerCoefficient();
        double c = scannerCoefficient();
        printRootsOfQuadraticEquation(a, b, c);

    }

    public static double scannerCoefficient() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        return sc.nextDouble();
    }

    public static void printRootsOfQuadraticEquation(double a, double b, double c) {
        if (a != 0) {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            if (discriminant < 0) {
                System.out.println("The quadratic equation hasn't real roots");
            } else if (discriminant == 0) {
                double root12 = -b / (2 * a);
                System.out.println("The quadratic equation has real root: " + root12);
            } else if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The quadratic equation has 2 distinct real roots: ");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            }
        } else {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("The quadratic equation has an infinite set of solutions");
                } else {
                    System.out.println("The quadratic equation hasn't roots");
                }
            } else{
                System.out.println("The quadratic equation has real root: ");
                System.out.println(-c / b);
            }
        }

    }
}
