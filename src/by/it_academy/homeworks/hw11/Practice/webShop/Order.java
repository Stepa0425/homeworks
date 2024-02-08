package by.it_academy.homeworks.hw11.Practice.webShop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int numberOfOrder;
    //private int priceOfOrder;

    List<OrderItem> items = new ArrayList<>();

    public Order(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public int getGeneralCost() {
        int totalCost = 0;
        for (OrderItem item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }
}
