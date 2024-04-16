package by.it_academy.homeworks.lesson16.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        try (final FileOutputStream fos = new FileOutputStream("resources/lesson16/employees.txt");
             final ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(new Employee("John", "Doe", 30));
            oos.writeObject(new Employee("Jane", "Doe", 25));
            oos.writeObject(new Employee("William", "Williams", 40));

        } catch (Exception e) {
            System.out.println("Error with message " + e.getMessage() + " occurred");
        }

    }
}