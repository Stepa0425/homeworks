package by.it_academy.homeworks.hw7.Practice;

public class Sphere implements Figure3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 4.0 / 3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceSquare() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
