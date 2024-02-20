package by.it_academy.homeworks.lesson14.practice.employee.info;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John"));
        employees.add(new Employee("Bob"));
        employees.add(new Employee("William"));

        Consumer<Employee> printEmployeeInfo = Employee::printEmployeeInfo;
        employees.forEach(printEmployeeInfo);
    }
}