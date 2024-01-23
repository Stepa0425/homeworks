package by.it_academy.homeworks.hw7.anonypmus;

public class AnonymousClass {
    public static void main(String[] args) {
        //some code
        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Woof-woof");
            }

            @Override
            public void printInfo() {
                System.out.println("I am the dog!!!");
            }
        };

        dog.printInfo();
        dog.makeSound();
    }
}