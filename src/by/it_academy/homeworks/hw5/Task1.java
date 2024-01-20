package by.it_academy.homeworks.hw5;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = {{0, 1}, {2, 3}, {4, 5}, {6, 7}, {8}};
        printTwoDimensionalArray(array);
        int[][] transposedArray = getTransposed(array);
        printTwoDimensionalArray(transposedArray);
    }

    public static int[][] getTransposed(int[][] array) {
        boolean isTransposable = isTransposable(array);

        if (!isTransposable) {
            System.out.println("The array isn't transposed.");
            return array;
        }

        int[][] transposedMatrix = new int[array[0].length][array.length];
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = array[j][i];
            }
        }

        return transposedMatrix;
    }

    public static void printTwoDimensionalArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " \t");
            }
            System.out.println("\n");
        }

    }

    public static boolean isTransposable(int[][] array) {
        int lengthRow = array[0].length;

        for (int[] row : array) {
            if (row.length != lengthRow) {
                return false;
            }
        }

        return true;
    }
}
