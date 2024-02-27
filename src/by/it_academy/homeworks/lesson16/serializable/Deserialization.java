package by.it_academy.homeworks.lesson16.serializable;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Deserialization {
    public static void main(String[] args) {
        try (final FileInputStream fis = new FileInputStream("resources/lesson16/employees.txt");
             final ObjectInputStream objectInputStream = new ObjectInputStream(fis)){

            List<Employee> employees = readEmployees(objectInputStream);

            employees.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static List<Employee> readEmployees(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        List<Employee> employees = new ArrayList<>();
        Employee employee;

        try {
            while ((employee = (Employee) objectInputStream.readObject()) != null) {
                employees.add(employee);
            }
        } catch (EOFException e) {
            System.out.println("End of file");
        }

        return employees;
    }
}