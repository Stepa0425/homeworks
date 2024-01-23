package by.it_academy.homeworks.hw7.Practice.example;

public abstract class Flower {
    private double price;
    private String color;
    private int  lifeExpectancyInDays;

    public Flower(double price, String color, int lifeExpectancyInDays) {
        this.price = price;
        this.color = color;
        this.lifeExpectancyInDays = lifeExpectancyInDays;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLifeExpectancyInDays(int lifeExpectancyInDays) {
        this.lifeExpectancyInDays = lifeExpectancyInDays;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getLifeExpectancyInDays() {
        return lifeExpectancyInDays;
    }
}
