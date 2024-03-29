package by.it_academy.homeworks.lesson24.datetimeapi.deprecated;

import java.time.LocalDate;
import java.time.Month;

public class Practice {
    public static void main(String[] args) {
        if (isDateOdd("JANUARY 23 2000")){
            System.out.println("Date is odd.");
        }else{
            System.out.println("Date is even.");
        }
    }

    public static boolean isDateOdd(String date) {
        LocalDate parsedDate = parseSpecificString(date);

        int dayOfYear = parsedDate.getDayOfYear();

        return dayOfYear % 2 == 1;
    }

    public static LocalDate parseSpecificString(String date){
        String[] dateComponents = date.split(" ");

        String monthStr = dateComponents[0];
        Month month = Month.valueOf(monthStr);

        String dayStr = dateComponents[1];
        int day = Integer.parseInt(dayStr);

        String yearStr = dateComponents[2];
        int year = Integer.parseInt(yearStr);

        return LocalDate.of(year,month,day);
    }
}
