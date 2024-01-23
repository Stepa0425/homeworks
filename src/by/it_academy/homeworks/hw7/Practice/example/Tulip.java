package by.it_academy.homeworks.hw7.Practice.example;

public class Tulip extends Flower {
    public Tulip(double color, String price, int lifeExpectancyInDays) {
        super(color, price, lifeExpectancyInDays);
    }

    @Override
    public String toString() {
        return "Tulip has price = " + getPrice() + ", color = " + getColor() + " and lifeExpectancyInDays = " + getLifeExpectancyInDays();
    }
}
