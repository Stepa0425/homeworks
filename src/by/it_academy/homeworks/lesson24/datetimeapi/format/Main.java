package by.it_academy.homeworks.lesson24.datetimeapi.format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
// форматирование
        String formatted1 = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Formatted current DateTime is " + formatted1);
        String formatted2 = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Formatted current DateTime is " + formatted2);
// парсинг
        String dateToParse = "01-04-2024";
        LocalDate parsedDate = LocalDate.parse(
                dateToParse,
                DateTimeFormatter.ofPattern("dd-MM-yyyy")
        );
        System.out.println("\nParsed String: " + dateToParse + "\ninto LocalDate: " +
                parsedDate);
    }
}
