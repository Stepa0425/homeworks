package by.it_academy.homeworks.lesson25.annotation.plus.reflection.print;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, 4000);
        Printer.print(employee);
    }
}
