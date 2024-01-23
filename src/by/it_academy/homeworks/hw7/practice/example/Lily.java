package by.it_academy.homeworks.hw7.practice.example;

public class Lily extends Flower {
    public Lily(double price, String color, int lifeExpectancyInDays) {
        super(price, color, lifeExpectancyInDays);
    }

    @Override
    public String toString() {
        return "Lily has price = " + getPrice() + ", color = " + getColor() + " and lifeExpectancyInDays = " + getLifeExpectancyInDays();
    }
}
