package by.it_academy.homeworks.hw7.Practice.example;

public class Rose extends Flower {
    public Rose(double price, String color, int lifeExpectancyInDays) {
        super(price, color, lifeExpectancyInDays);
    }


    @Override
    public String toString() {
        return "Rose has price = " + getPrice() + ", color = " + getColor() + " and lifeExpectancyInDays = " + getLifeExpectancyInDays();
    }
}
