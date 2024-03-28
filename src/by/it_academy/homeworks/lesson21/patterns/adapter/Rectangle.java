package by.it_academy.homeworks.lesson21.patterns.adapter;

//Не совместим с интерфейсом Shape
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public void drawRectangle() {
        System.out.println("Drawing a rectangle with width: " + width + ", height: " + height);
    }
}
