package by.it_academy.homeworks.hw7.practice.example;

public class Carnation  extends Flower{
    public Carnation(double price, String color, int lifeExpectancyInDays) {
        super(price, color, lifeExpectancyInDays);
    }

    @Override
    public String toString() {
        return "Carnation has price = " + getPrice() + " , color = " + getColor()+" and lifeExpectancyInDays = " + getLifeExpectancyInDays();
    }
}
