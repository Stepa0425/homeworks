package by.it_academy.homeworks.lesson25.combination.annotation.plus.print;

public class Employee {
    @Printable
    private String name;
    @Printable
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
