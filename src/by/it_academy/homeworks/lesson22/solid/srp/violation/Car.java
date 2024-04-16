package by.it_academy.homeworks.lesson22.solid.srp.violation;

public class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;

    public String generateReport() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Mileage: " + mileage;
    }
}
