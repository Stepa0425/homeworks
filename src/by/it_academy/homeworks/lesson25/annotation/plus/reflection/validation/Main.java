package by.it_academy.homeworks.lesson25.annotation.plus.reflection.validation;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person jonh = new Person("John", 30);
        System.out.println("Validation result: "+ ObjectValidator.validate(jonh));

        Person alice = new Person("Alice", 300);
        System.out.println("Validation result: "+ ObjectValidator.validate(alice));
    }
}
