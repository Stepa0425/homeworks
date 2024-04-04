package by.it_academy.homeworks.lesson24.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product ball = new Product("ball", 23.59, 4.9, Category.SPORT);
        Product dumbbells = new Product("Dumbbells", 5.9, 4.2, Category.SPORT);
        Product hockeyStick = new Product("Hockey stick", 80, 4.86, Category.SPORT);

        Product violin = new Product("Violin", 450, 5, Category.MUSIC);
        Product drums = new Product("Drums", 190, 4.8, Category.MUSIC);
        Product piano = new Product("Piano", 299, 4.67, Category.MUSIC);

        Product canvas = new Product("Canvas", 4.9, 4.9, Category.ART);
        Product paints = new Product("Paints", 9.9, 4.18, Category.ART);
        Product brushes = new Product("Brushes", 16.4, 3.8, Category.ART);

        Basket basket1 = new Basket(List.of(canvas, paints,violin,dumbbells));
        Basket basket2 = new Basket(List.of(brushes, drums,hockeyStick,ball));
        Basket basket3 = new Basket(List.of(canvas, ball,piano,dumbbells));

        printBasketInfo(basket1);
        printBasketInfo(basket2);
        printBasketInfo(basket3);
    }

    public static void printBasketInfo(Basket basket) {
        System.out.print("Date:                                     ");
        printDate(basket.getDate());
        System.out.println("Products           Category               Price");
        System.out.println("-------------------------------------------------------");

        for (Product product : basket.getProductList()) {
            String name = product.getName();
            Category category = product.getCategory();
            double price = product.getPrice();
            System.out.printf("%-20s %-20s %.2f$\n", name, category, price);
        }

        System.out.println("-------------------------------------------------------");
        System.out.printf("Result                                    %.2f$\n\n", basket.getSummaryPrice());
    }

    public static void printDate(LocalDate date){
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(formattedDate);
    }
}
