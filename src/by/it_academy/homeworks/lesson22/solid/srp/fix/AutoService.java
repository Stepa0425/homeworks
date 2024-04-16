package by.it_academy.homeworks.lesson22.solid.srp.fix;

public class AutoService {
    public String generateReport(Car car) {
        return "Make: " + car.getMake() + ", Model: " + car.getModel() + ", Year: " + car.getYear() + ", Mileage: " + car.getMileage();
    }
}
