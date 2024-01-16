package by.it_academy.homeworks.hw5;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    private void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String getFractionString() {
        return this.numerator + " / " + this.denominator;
    }

    /*Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
    метод, добавляющий (сложение) к текущей дроби дробь, переданную ему в параметре и возвращающий дробь - результат сложения;
    метод, умножающий (произведение) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат умножения;
    метод, делящий (деление) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат деления.*/

    public Fraction add(Fraction fraction1) {
        int commonDenominator = this.denominator * fraction1.denominator;
        int resultNominator = this.numerator * fraction1.denominator + this.denominator * fraction1.numerator;
        return new Fraction(resultNominator,commonDenominator);
    }

    public Fraction multiplicate(double number){
        double numerator = this.numerator * number;
        return new Fraction();
    }
}
