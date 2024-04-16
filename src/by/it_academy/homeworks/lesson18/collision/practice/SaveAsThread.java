package by.it_academy.homeworks.lesson18.collision.practice;

import java.io.FileWriter;
import java.util.Arrays;

/*Заданы три целочисленных массива. Записать эти массивы в файл в параллельных потоках.
Создать класс SaveAsThread для представления потока, который записывает целочисленный массив в файл*/
public class SaveAsThread extends Thread {

    private int[] array;
    private String filename;

    public SaveAsThread(int[] array, String filename) {
        this.array = array;
        this.filename = filename;
    }

    @Override
    public void run() {
        try (FileWriter writer = new FileWriter(filename, true)) {
            for (int el : array) {
                writer.write(el + "\n");
            }
            System.out.println("\nArray: " + Arrays.toString(array) + " is written!");
        } catch (Exception e) {
            System.out.println("Exception with " + e.getMessage() + " = is thrown.");
            throw new RuntimeException("U have exception(");
        }

    }
}
