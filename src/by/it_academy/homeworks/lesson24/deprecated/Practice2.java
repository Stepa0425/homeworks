package by.it_academy.homeworks.lesson24.deprecated;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        List<LocalDate> dateOfHolidays = List.of(LocalDate.of(2024, Month.JANUARY, 1),
                LocalDate.of(2024, Month.JANUARY, 7),
                LocalDate.of(2024, Month.MARCH, 8),
                LocalDate.of(2024, Month.MAY, 1));

        printDates(dateOfHolidays);
    }


    public static void printDates(List<LocalDate> dates) {
        List<String> formattedDates = dates.stream()
                .map(date -> date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")))
                .toList();

        formattedDates.forEach(System.out::println);
    }
}
