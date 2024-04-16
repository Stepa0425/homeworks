package by.it_academy.homeworks.lesson24.datetimeapi.temporal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate. now();
        LocalDate lastDayOfMonth = now.with(TemporalAdjusters. lastDayOfMonth());
        System.out.println("Last day of month is " + lastDayOfMonth);
        DayOfWeek dayOfWeek = DayOfWeek. TUESDAY;
        LocalDate nextDayOfWeek = now.with(TemporalAdjusters. next(dayOfWeek));
        System.out.println("Next " + dayOfWeek + " date is " + nextDayOfWeek);
    }
}
