package by.it_academy.homeworks;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double averageScore = 0;
        boolean isError = false;

        System.out.print("Enter the number of subjects: ");
        int numbersOfSubjects = sc.nextInt();

        if (numbersOfSubjects > 0) {
            for (int i = 1; i <= numbersOfSubjects; i++) {
                System.out.print("Enter a score of subject №" + i + ": ");
                double currentScore = sc.nextDouble();

                if ((currentScore >= 1) && (currentScore <= 10) && (currentScore % 1 == 0)) {
                    averageScore += currentScore;
                } else {
                    System.out.println("Error! Enter an integer from 1 to 10.");
                    isError = true;
                    break;
                }
            }

            if (isError == false) {
                averageScore /= numbersOfSubjects;
                System.out.println("Average score: " + averageScore);
            }
        } else {
            System.out.println("Enter the correct value!");
        }
    }
}
