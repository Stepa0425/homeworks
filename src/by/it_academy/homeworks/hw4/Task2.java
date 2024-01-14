package by.it_academy.homeworks.hw4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {5, 12, 9, -25, 8, 15, 7, 9, 20, -18, 9, 5};
        for (int el : array) {
            System.out.print(el + " ");
        }
        int[] newArray = removeIdenticalElements(array);
        System.out.println();
        for (int el : newArray) {
            System.out.print(el + " ");
        }
    }

    public static int[] removeIdenticalElements(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    for (int k = j; k < length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    length--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, length);
    }
}
