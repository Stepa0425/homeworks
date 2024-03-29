package by.it_academy.homeworks.lesson22.practice.example1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LibraryCatalog {
    private List<Book> books;

    public LibraryCatalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBookByTitle(String bookTitle) {
        return books.stream()
                .filter((book) -> book.getTitle().equalsIgnoreCase(bookTitle))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Book with required title: " + bookTitle + " isn't in the catalog."));
    }
}