package by.it_academy.homeworks.lesson24.hw;

public class Product {
    private String name;
    private double price;
    private double rating;
    private Category category;

    public Product(String name, double price, double rating, Category category) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public Category getCategory() {
        return category;
    }
}
