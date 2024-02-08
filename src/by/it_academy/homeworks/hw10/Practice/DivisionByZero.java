package by.it_academy.homeworks.hw10.Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int d;
        double result;
        try {
            System.out.println("Enter a and b: ");
            a = scanner.nextInt();
            d = scanner.nextInt();
            result = (double) a/d;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass() + " is thrown!");
        } catch (ArithmeticException e) {
            System.out.println(e.getClass() + " is thrown!");
        }finally {
            System.out.println("Try-catch-finally block execution successfully finished!");
        }
    }

}
