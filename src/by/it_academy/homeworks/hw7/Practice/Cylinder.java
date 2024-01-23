package by.it_academy.homeworks.hw7.Practice;

import java.util.MissingFormatArgumentException;

public class Cylinder implements Figure3D {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double getSurfaceSquare() {
        return (height + radius) * 2 * Math.PI * radius;
    }
}
