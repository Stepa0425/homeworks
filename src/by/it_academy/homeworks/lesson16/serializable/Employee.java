package by.it_academy.homeworks.lesson16.serializable;

import java.io.Serializable;

public class Employee implements Serializable {

    private String firstName;
    private String lastName;
    private Integer age;

    public Employee(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}