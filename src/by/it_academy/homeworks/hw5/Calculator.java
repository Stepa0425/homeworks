package by.it_academy.homeworks.hw5;

// Объявление класса
class Calculator {
    // Поля класса - его свойства (значения)
    private double result;

    // Конструктор - метод, который отвечает за создание объекта
    public Calculator() {
        this.result = 0;
    }

    // Методы класса - его возможности
    public void add(double num) {
        this.result += num;
    }

    public void subtract(double num) {
        this.result -= num;
    }

    public double getResult() {
        return result;
    }
}