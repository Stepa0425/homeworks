package by.it_academy.homeworks.lesson24.datetimeapi.zone;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Current time is " + now);

        String formatted = now.format(DateTimeFormatter.ofPattern("dd-yy-yyyy"));
        System.out.println("Current formatted time is " + formatted);

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("Today is " + dayOfWeek);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.of("UTC+3"));
        System.out.println("ZonedDateTime " + zonedDateTimeNow);
    }
}
