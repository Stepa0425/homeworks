package by.it_academy.homeworks.lesson26.Task1;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate dateOfBirthday;

    public Employee(String name, LocalDate dateBirthday) {
        this.name = name;
        this.dateOfBirthday = dateBirthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                '}';
    }
}
