package by.it_academy.homeworks.lesson25.annotation.plus.reflection.validation;

public class Person {
    @ValidName
    private String name;
    @ValidAge(min = 18, max = 150)
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
