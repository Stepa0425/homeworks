package by.it_academy.homeworks.hw3;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        //printSumAndMultiplicat(scannerInt());
        //printTheBiggerNumberAndIndex(scannerInt());
        printCountMistakes();
    }

    public static int scannerInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void printMultiplicationTable5() {
        int a = 5;
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * 5 " + "=" + " " + i * a);
        }
    }

    public static void printDegreesOf2() {
        int n = 1;
        for (int i = 1; i < 11; i++) {
            System.out.println(n);
            n = n * 2;
        }
    }

    public static void printRectangle(int lenght, int width) {
//        for(int i = 0; i< lenght; i++){
//            for (int j = 0; j < width; j++){
//
//            }
//        }
    }

    public static void printSumAndMultiplicat(int number) {
        int currentLastDigit = 0;
        int currentNumber = number;
        int sum = 0;
        int multiplication = 1;
        while (currentNumber != 0) {
            currentLastDigit = currentNumber % 10;
            currentNumber /= 10;
            sum += currentLastDigit;
            multiplication *= currentLastDigit;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + multiplication);
    }

    public static void printTheBiggerNumberAndIndex(int number) {
        String strNumber = String.valueOf(number);
        char[] numberCharArray = strNumber.toCharArray();
        int max = -1;
        int indexMax = -1;
        int i = 0;
        for (char digit : numberCharArray) {
            int currentDigit = Character.getNumericValue(digit);
            if (max < currentDigit) {
                max = currentDigit;
                indexMax = i;
            }
            i++;
        }

        System.out.println("Max digit is " + max);
        System.out.println("Max digit have position " + indexMax);
    }

    public static void printCountMistakes(){
            int unluckyNumbers = 0;
            for (int i = 1; i <= 50000; i++) {
                String strI = String.valueOf(i);
                if (strI.contains("2")) {
                    unluckyNumbers++;
                }
            }
        System.out.println("Mistake boxes are " + unluckyNumbers);
    }
}
