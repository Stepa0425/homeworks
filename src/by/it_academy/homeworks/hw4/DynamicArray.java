package by.it_academy.homeworks.hw4;

import java.util.Arrays;

public class DynamicArray {
    private int[] array;

    public DynamicArray() {
    }

    public DynamicArray(int size) {
        this.array = new int[size];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int size() {
        return this.array.length;
    }

    public void print() {
        for (int el : this.array) {
            System.out.print(el + "\t");
        }
        System.out.println();
    }

    public void add(int newElement) {
        if (this.array == null) {
            this.array = Arrays.copyOf(new int[1], 1);
            return;
        }
        int resultLength = this.array.length + 1;
        int[] resultArray = Arrays.copyOf(this.array, resultLength);
        resultArray[resultLength - 1] = newElement;
        this.array = resultArray;

    }

    public void addAll(int[] elements) {
        if (this.array == null) {
            this.array = Arrays.copyOf(elements, elements.length);
            return;
        }

        int resultLength = this.array.length + elements.length;
        int[] resultArray = Arrays.copyOf(this.array, resultLength);
        System.arraycopy(elements, 0, resultArray, array.length, elements.length);
        this.array = resultArray;
    }

    public void remove(int elementToRemove) {
        int length = this.array.length;
        if (!this.contains(elementToRemove)) {
            return;
        }

        for (int i = 0; i < length; i++) {
            if (this.array[i] == elementToRemove) {
                for (int j = i; j < length - 1; j++) {
                    this.array[j] = this.array[j + 1];
                }
                length--;
                break;
            }
        }

        int[] resultArray = new int[length];
        System.arraycopy(this.array, 0, resultArray, 0, length);
        this.array = resultArray;
    }

    public void removeAll(int[] elements) {
        int length = this.array.length;
        int lengthElements = elements.length;

        if (lengthElements > length) {
            return;
        }

        for (int i = 0; i <= length - lengthElements; i++) {
            int[] firstArray = new int[lengthElements];
            System.arraycopy(this.array, i, firstArray, 0, lengthElements);

            if (Arrays.equals(firstArray, elements)) {
                int k = 0;
                while (k < lengthElements) {
                    this.remove(this.array[i]);
                    k++;
                }
                break;
            }
        }
    }

    public int indexOf(int element) {
        if (!this.contains(element)) {
            return -1;
        }
        int index = 0;
        for (int i = 0; i < this.size(); i++) {
            if (this.array[i] == element) {
                index = i;
            }
        }
        return index;
    }

    public boolean contains(int element) {
        int indexElement = Arrays.binarySearch(this.array, element);
        return indexElement >= 0;
    }

    public int[] reversed() {
        int[] reversedArray = new int[this.size()];
        for (int i = this.size(); i > 0; i--) {
            reversedArray[this.size() - i] = this.array[i - 1];
        }
        return reversedArray;
    }
}

class Test {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        DynamicArray dynamicArray = new DynamicArray();
        int[] array = {2, 3, 4, 9, 2, 3, 4, 9};
        dynamicArray.setArray(array);
        dynamicArray.print();

        dynamicArray.remove(9);
        dynamicArray.removeAll(new int[]{3, 4});
        dynamicArray.print();

        System.out.println(dynamicArray.contains(5));
        int index = dynamicArray.indexOf(7);
        System.out.println(index);

        int[] reversedArray = dynamicArray.reversed();
        for (int el : reversedArray) {
            System.out.print(el + "\t");
        }
        System.out.println();

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Время выполнения проекта: " + executionTime + " мс");
    }
}

