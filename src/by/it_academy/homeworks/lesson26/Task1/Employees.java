package by.it_academy.homeworks.lesson26.Task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Employees {
    private List<Employee> employees;

    public Employees(List<Employee> employees) {
        this.employees = employees;
    }
    public void printEmployeesWithSameDayOfBirth(){
        printEmployeesWithSameDayOfBirth(employees);
    }

    public void printEmployeesWithSameDayOfBirth(List<Employee> page) {
        Map<DayOfWeek, List<Employee>> employeeMap = page.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDateOfBirthday().getDayOfWeek()));
        System.out.println(employeeMap);
       /* for (DayOfWeek day : DayOfWeek.values()) {
            List<Employee> sortedList = employees.stream()
                    .filter(employee -> (employee.getDateOfBirthday().getDayOfWeek().equals(day)))
                    .toList();
            System.out.println("In " + day + "  was born " + sortedList);
        }*/
    }

    public void printEmployeePage(int sizeOfPage, int numberOfPage) {
        List<Employee> page = employees.stream()
                .skip(sizeOfPage * (numberOfPage - 1))
                .limit(sizeOfPage)
                .toList();
        System.out.println(page);
    }

}
