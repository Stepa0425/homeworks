package by.it_academy.homeworks.hw11.Practice.webShop;

import java.util.ArrayList;
import java.util.List;

public class InternetShop {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order newOrder){
        orders.add(newOrder);
    }

    public void removeOrder(Order orderToRemove){
        orders.remove(orderToRemove);
    }
    public int getTotalCost(){
        int totalCost = 0;
        for (Order order  : orders) {
            totalCost += order.getGeneralCost();
        }
        return totalCost;
    }
}
