package by.it_academy.homeworks.lesson16.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class BookManager {

    public static List<Book> readBooksFromFile(String filename) {
        List<Book> books = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            books = (List<Book>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return books;
    }

    public static List<Book> readBooksAndFilter(String filename, Predicate<Book> filter) {
        return readBooksFromFile(filename).stream().filter(filter).toList();
    }

    public static List<Book> readBooksAndSort(String filename, Comparator<Book> comparator) {
        return readBooksFromFile(filename).stream().sorted(comparator).toList();
    }
}