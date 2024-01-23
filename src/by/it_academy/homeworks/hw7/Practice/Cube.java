package by.it_academy.homeworks.hw7.Practice;

public class Cube implements Figure3D {
    private int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public double getVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public double getSurfaceSquare() {
        return 6 * Math.pow(a, 2);
    }
}
