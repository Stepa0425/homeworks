package by.it_academy.homeworks.lesson14.practice.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Bob", 29));
        employees.add(new Employee("John", 31));
        employees.add(new Employee("Jane", 35));

        double averageAge = employees.stream()
                .filter(employee -> employee.age() > 30) // Stream<Employee>
                .mapToDouble(employee -> employee.age()) //Stream<Double>
                .average()
                .getAsDouble();

        System.out.println("Average age is " + averageAge);
    }
}
