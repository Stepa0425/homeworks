package by.it_academy.homeworks.hw4;

import java.util.Arrays;

public class DynamicArray {
    private int[] array;
    private final double GROWTH_FACTOR = 1.5;
    private int capacity;
    private int size;
    private int numberOfElements;

    public DynamicArray(int size) {
        this.capacity = getSizeWithCapacity(size);
        this.array = new int[this.capacity];
        this.size = size;
        this.numberOfElements = 0;
    }

    public DynamicArray(int[] array) {
        this.capacity = getSizeWithCapacity(array.length);
        this.array = Arrays.copyOf(array, this.capacity);
        this.size = array.length;
        this.numberOfElements = array.length;
    }

    private int getSizeWithCapacity(int size) {
        return (int) (size * GROWTH_FACTOR);
    }

    private void increaseCapacity() {
        this.capacity = getSizeWithCapacity(this.capacity);
        this.array = Arrays.copyOf(this.array, this.capacity);
    }

    private int[] getArray() {
        return array;
    }


    public int size() {
        return this.size;
    }

    public void print() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[i] + "\t");
        }
        System.out.println();
    }

    public void add(int newElement) {
        if (this.size == capacity) {
            increaseCapacity();
        }
        this.array[this.size] = newElement;
        this.size++;
        this.numberOfElements++;

    }

//    public void addAll(int[] elements) {
////        int resultLength = this.array.length + elements.length;
////        int[] resultArray = Arrays.copyOf(this.array, resultLength);
////        System.arraycopy(elements, 0, resultArray, array.length, elements.length);
////        this.array = resultArray;
//        while (this.size + elements.length > this.capacity) {
//            this.increaseCapacity();
//        }
//        this.size += elements.length;
//        this.numberOfElements += elements.length;
//        int[] resultArray = Arrays.copyOf(this.array, this.capacity);
//        System.arraycopy(elements, 0, resultArray, this.size, elements.length);
//        this.array = resultArray;
//
//
//    }
//
//    public void remove(int elementToRemove) {
//        int length = this.array.length;
//
//        for (int i = 0; i < length; i++) {
//            if (this.array[i] == elementToRemove) {
//                for (int j = i; j < length - 1; j++) {
//                    this.array[j] = this.array[j + 1];
//                }
//                length--;
//                break;
//            }
//        }
//
//        int[] resultArray = new int[length];
//        System.arraycopy(this.array, 0, resultArray, 0, length);
//        this.array = resultArray;
//    }
//
//    public void removeAll(int[] elements) {
//        int length = this.array.length;
//        int lengthElements = elements.length;
//
//        if (lengthElements > length) {
//            return;
//        }
//
//        for (int i = 0; i <= length - lengthElements; i++) {
//            int[] firstArray = new int[lengthElements];
//            System.arraycopy(this.array, i, firstArray, 0, lengthElements);
//
//            if (Arrays.equals(firstArray, elements)) {
//                int k = 0;
//                while (k < lengthElements) {
//                    this.remove(this.array[i]);
//                    k++;
//                }
//                break;
//            }
//        }
//    }
//
    public int indexOf(int element) {
        int index = -1;
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
        int[] array = {2, 3, 4, 9, 2, 3, 4, 9};

        DynamicArray dA1 = new DynamicArray(array);
        DynamicArray dA3 = new DynamicArray(4);

        dA1.print();
        System.out.println(dA1.size());
        dA3.print();
        dA1.add(5);
        System.out.println(dA1.size());
        System.out.println(dA3.contains(0));


        int[] reversedArray = dA1.reversed();
        System.out.println(dA1.indexOf(9));
        for (int el : reversedArray) {
            System.out.print(el + "\t");
        }
        System.out.println();

    }
}

