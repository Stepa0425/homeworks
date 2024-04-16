package by.it_academy.homeworks.lesson22.solid.lsp.fix;

public class Shape {
    private int width;
    private int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}
