package by.it_academy.homeworks.hw4;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};
        int[] newArray = mergeArrays(array1, array2);
        for (int el : newArray) {
            System.out.print(el + " ");
        }
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] arrayMerged = new int[array1.length + array2.length];
        for (int i = 0, j = 0, k = 0; i < arrayMerged.length; ) {
            arrayMerged[i++] = array1[j++];
            arrayMerged[i++] = array2[k++];
        }
        return arrayMerged;
    }
}
