package by.it_academy.homeworks.hw7.Practice;

public class Cone implements Figure3D {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return 1.0 / 3 * Math.PI * radius * height;
    }

    @Override
    public double getSurfaceSquare() {
        return Math.PI * Math.pow(radius, 2) + Math.PI * radius * height;
    }
}
