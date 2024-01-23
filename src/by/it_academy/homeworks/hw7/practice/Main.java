package by.it_academy.homeworks.hw7.practice;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(4);
        printVolumeAndSurfaceSquare(cube);

        Sphere sphere = new Sphere(4);
        printVolumeAndSurfaceSquare(sphere);

        Cone cone = new Cone(5,8);
        printVolumeAndSurfaceSquare(cone);

        Cylinder cylinder = new Cylinder(7, 6);
        printVolumeAndSurfaceSquare(cylinder);

    }

    public static void printVolumeAndSurfaceSquare(Figure3D figure3D){
        System.out.println("Surface square is " + figure3D.getSurfaceSquare());
        System.out.println("Volume is " + figure3D.getVolume());
    }
}
