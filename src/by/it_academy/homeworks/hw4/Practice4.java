package by.it_academy.homeworks.hw4;

public class Practice4 {
    public static void main(String[] args) {
        int[] array = {5, 12, 9, 25, 8, 15, 7, 14, 20, 18};
        printMinAndMax(array);
    }

    public static void printMinAndMax(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static int getSumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getMaxEven(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i += 2) {
            if ((max < array[i])) {
                max = array[0];
            }
        }
        return max;
    }

    public static int[][] getPositiveAndNegativeArrays(int[] array) {
        int[][] positiveAndNegativeArray = new int[2][array.length];
        for (int i = 0, indexPositive = 0, indexNegative = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveAndNegativeArray[0][indexPositive] = array[i];
                indexPositive++;
            } else {
                positiveAndNegativeArray[1][indexNegative] = array[i];
                indexNegative++;
            }
        }
        return positiveAndNegativeArray;
    }

    public static int getMinIndexArray(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getMaxIndexArray(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
