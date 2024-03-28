package by.it_academy.homeworks.lesson21.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Shape shape = new RectagnleAdapter(rectangle);
        System.out.println("Area: " + shape.getArea());

        shape.draw();
    }
}
