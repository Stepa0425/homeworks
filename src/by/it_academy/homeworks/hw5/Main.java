package by.it_academy.homeworks.hw5;

public class Main {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        Fraction fraction = new Fraction(4,6);
//        System.out.println(fraction.toString());
//        System.out.println(fraction.getFractionString());
//        Fraction resultFraction = fraction.add(new Fraction(3,6));
//        System.out.println(resultFraction.getFractionString());
        Fraction fraction0 = new Fraction(4, 5);
        fraction0 = fraction0.multiplyDouble(2.375);
        System.out.println(fraction0.getFractionString());

    }
}
