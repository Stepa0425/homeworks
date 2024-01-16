package by.it_academy.homeworks.hw5;

public class Practice5 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int maxSum = 0;
        int numberRow = 0;
        for (int i = 0; i < matrix.length; ++i) {
            int currentSum = 0;

            for (int j = 0; j < matrix[i].length; ++j) {
                currentSum += matrix[i][j];
            }

            if (maxSum < currentSum) {
                maxSum = currentSum;
                numberRow = i;
            }
        }

        System.out.println("Row with max sum is " + numberRow);
    }
}
