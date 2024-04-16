package by.it_academy.homeworks.lesson26.Task1;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee alex = new Employee("Alex", LocalDate.of(2024, Month.APRIL, 8));
        Employee andrew = new Employee("Andrew", LocalDate.of(2005, Month.JANUARY, 14));
        Employee alice = new Employee("Alice", LocalDate.of(1994, Month.DECEMBER, 12));
        Employee victor = new Employee("Victor", LocalDate.of(2012, Month.MAY, 16));

        Employees employees = new Employees(List.of(alex, alice, andrew, victor));
        employees.printEmployeesWithSameDayOfBirth();

        employees.printEmployeePage(2,1);
    }
}
