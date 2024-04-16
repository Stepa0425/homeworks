package by.it_academy.homeworks.lesson24.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Basket {
    private List<Product> productList;
    private LocalDate date;

    public Basket(List<Product> productList) {
        this.productList = productList;
        this.date = LocalDate.now();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public LocalDate getDate() {
        return date;
    }
    public double getSummaryPrice(){
        return productList.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }


    public void printInfo() {
        System.out.print("Date:                                     ");
        printDate(this.getDate());
        System.out.println("Products           Category               Price");
        System.out.println("-------------------------------------------------------");

        for (Product product : this.getProductList()) {
            String name = product.getName();
            Category category = product.getCategory();
            double price = product.getPrice();
            System.out.printf("%-20s %-20s %.2f$\n", name, category, price);
        }

        System.out.println("-------------------------------------------------------");
        System.out.printf("Result                                    %.2f$\n\n", this.getSummaryPrice());
    }

    public void printDate(LocalDate date){
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(formattedDate);
    }
}
