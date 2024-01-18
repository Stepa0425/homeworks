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

    private void shortenFraction() {
        int resultNumerator = this.numerator / this.getLCD(this.numerator, this.denominator);
        int resultDenominator = this.denominator / this.getLCD(this.numerator, this.denominator);
        this.numerator = resultNumerator;
        this.denominator = resultDenominator;
    }

    // LCD - Largest Common Divisor
    private int getLCD(int number1, int number2) {
        int divisor = Math.max(number1, number2);
        int divisible = Math.min(number1, number2);
        int remainder = divisor % divisible;

        while (remainder != 0) {
            divisor = divisible;
            divisible = remainder;
            remainder = divisor % divisible;
        }

        return divisible;
    }
    /*Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
    метод, добавляющий (сложение) к текущей дроби дробь, переданную ему в параметре и возвращающий дробь - результат сложения;
    метод, умножающий (произведение) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат умножения;
    метод, делящий (деление) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат деления.*/

    public Fraction add(Fraction fraction1) {
        int commonDenominator = this.denominator * fraction1.denominator;
        int resultNominator = this.numerator * fraction1.denominator + this.denominator * fraction1.numerator;
        Fraction resultFraction = new Fraction(resultNominator, commonDenominator);
        resultFraction.shortenFraction();
        return resultFraction;
    }

    public Fraction multiplyDoubleNumber(double number) {
        double numerator = this.numerator * number;
        int remainderOfDivision = (int) ((numerator % 1) * 100000);
        numerator -= (remainderOfDivision / 100000);

        Fraction fraction1 = new Fraction((int) numerator, this.denominator);
        Fraction fraction2 = new Fraction(remainderOfDivision, this.denominator * 100000);

        return fraction1.add(fraction2);
    }

    public Fraction divideByDoubleNumber(double number) {
        return this.multiplyDoubleNumber(1 / number);
    }


}
