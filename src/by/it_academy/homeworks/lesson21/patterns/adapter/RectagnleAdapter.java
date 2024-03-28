package by.it_academy.homeworks.lesson21.patterns.adapter;

public class RectagnleAdapter implements Shape {
    private Rectangle rectangle;

    public RectagnleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public double getArea() {
        return rectangle.calculateArea();
    }

    @Override
    public void draw() {
        rectangle.drawRectangle();
    }
}
