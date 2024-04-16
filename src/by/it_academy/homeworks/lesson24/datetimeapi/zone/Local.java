package by.it_academy.homeworks.lesson24.datetimeapi.zone;

import java.time.*;

public class Local {
    public static void main(String[] args) {
        //текущая дата
        LocalDate date = LocalDate.now();//2024-04-02
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        //создание с указанием определенных данных
        LocalDate specificDate = LocalDate.of(2017, Month.NOVEMBER, 30);
        LocalTime specificTime = LocalTime.of(16, 30, 50, 234782);
        LocalDateTime specificDateTime = LocalDateTime.of(2017, Month.JULY, 9, 11, 6, 22);

        LocalDate day140_2019 = LocalDate.ofYearDay(2019, 140);
        LocalDateTime now = LocalDateTime.of(LocalDate.now(), LocalTime.now());

        //создание с помощью секунд
        LocalDateTime dateTimeEpoch = LocalDateTime.ofEpochSecond(171157424L, 0, ZoneOffset.UTC);
        System.out.println("dateTimeEpoch = " + dateTimeEpoch);
    }
}
