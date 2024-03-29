package by.it_academy.homeworks.lesson22.solid.ocp.violation;

public class Shape {
    public double calculateArea(String shapeType, double... dimensions) {
        if (shapeType.equalsIgnoreCase("circle")) {
            double radius = dimensions[0];
            return Math.PI * radius * radius;
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            double lenght = dimensions[0];
            double width = dimensions[1];
            return lenght * width;
        } else {
            throw new IllegalArgumentException("Unsupported shape type");
        }
    }

    public double calculatePerimeter(String shapeType, double... dimensions) {
        if (shapeType.equalsIgnoreCase("circle")) {
            double radius = dimensions[0];
            return 2 * Math.PI * radius;
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            double lenght = dimensions[0];
            double width = dimensions[1];
            return 2 * (lenght + width);
        } else {
            throw new IllegalArgumentException("Unsupported shape type");
        }
    }

}

