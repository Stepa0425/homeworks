package by.it_academy.homeworks.lesson24.hw;

import java.time.LocalDate;
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
}
