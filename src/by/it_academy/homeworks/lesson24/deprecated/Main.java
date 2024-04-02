package by.it_academy.homeworks.lesson24.deprecated;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();

        //количество миллисекунд
        long time = date.getTime();
        System.out.println("UNix format time " + time);
        //deprecated
        int minutes = date.getMinutes();
        System.out.println("Minutes " + minutes);

        Calendar calendar = Calendar.getInstance();
        System.out.println("Time according to calendar " + calendar.getTime());
        System.out.println("Weeks in year according to calendar  " + calendar.getWeeksInWeekYear());
    }
}
