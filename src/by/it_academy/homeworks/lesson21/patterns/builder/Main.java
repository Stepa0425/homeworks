package by.it_academy.homeworks.lesson21.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .size("Large")
                .crustType("Thick crust")
                .toppings("Pepperoni, Mushrooms, Extra cheese")
                .build();
        System.out.println(pizza.toString());
    }
}
