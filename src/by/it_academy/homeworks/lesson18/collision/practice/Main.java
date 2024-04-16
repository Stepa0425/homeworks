package by.it_academy.homeworks.lesson18.collision.practice;

/*Заданы три целочисленных массива. Записать эти массивы в файл в параллельных потоках.
Создать класс SaveAsThread для представления потока, который записывает целочисленный массив в файл*/
public class Main {
    public static void main(String[] args) {
        final String PATH_TO_FILE = "resources/lesson18/arrays.txt";
        int[] array1 = {1, 2, 3, 5};
        int[] array2 = {1, 9, 8, 5};
        int[] array3 = {5, 2, 3, 7};

        SaveAsThread saveAsThread1 = new SaveAsThread(array1, PATH_TO_FILE);
        SaveAsThread saveAsThread2 = new SaveAsThread(array2, PATH_TO_FILE);
        SaveAsThread saveAsThread3 = new SaveAsThread(array3, PATH_TO_FILE);

        saveAsThread1.start();
        saveAsThread2.start();
        saveAsThread3.start();

        try {
            saveAsThread1.join();
            saveAsThread2.join();
            saveAsThread3.join();

            System.out.println("We are ready!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
