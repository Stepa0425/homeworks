package by.it_academy.homeworks.hw5;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Fraction fraction = new Fraction(4,6);
        System.out.println(fraction.toString());
        System.out.println(fraction.getFractionString());
        Fraction resultFraction = fraction.add(new Fraction(3,6));
        System.out.println(resultFraction.getFractionString());
    }
}