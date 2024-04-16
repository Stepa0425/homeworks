package by.it_academy.homeworks.lesson14.practice.employee.info;

public record Employee(String name) {
    public static void printEmployeeInfo(Employee employee) {
        System.out.println("Employee with name: " + employee.name());
    }
}
