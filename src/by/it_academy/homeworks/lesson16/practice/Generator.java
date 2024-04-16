package by.it_academy.homeworks.lesson16.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        List<Book> books = generateBooks(30);
        writeBooksToFile(books, "resources/lesson16/books.txt");
    }

    public static List<Book> generateBooks(int count) {
        List<Book> books = new ArrayList<>();
        Random random = new Random();
        String[] titles = {"Java Programming", "Data Structures", "Design Patterns", "Algorithms", "Clean Code"};
        String[] authors = {"John Doe", "Alice Smith", "Bob Johnson", "Emma Brown", "Chris Wilson"};

        for (int i = 0; i < count; i++) {
            String title = titles[random.nextInt(titles.length)];
            String author = authors[random.nextInt(authors.length)];
            int pages = random.nextInt(500) + 100;
            books.add(new Book(title, author, pages));
        }

        return books;
    }
    public static void writeBooksToFile(List<Book> books, String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(books);
            System.out.println("Books have been written to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}