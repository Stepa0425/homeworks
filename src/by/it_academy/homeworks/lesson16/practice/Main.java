package by.it_academy.homeworks.lesson16.practice;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = BookManager.readBooksFromFile("resources/lesson16/books.txt");

        books.forEach(System.out::println);
        System.out.println("Filtered");
        List<Book> filtered = BookManager.readBooksAndFilter(
                "resources/lesson16/books.txt",
                book -> book.getTitle().equals("Algorithms")
        );
        filtered.forEach(System.out::println);

        System.out.println("\nSorted");
        List<Book> sorted = BookManager.readBooksAndSort(
                "resources/lesson16/books.txt",
                Comparator.comparing(Book::getTitle)
        );
        sorted.forEach(System.out::println);
    }
}