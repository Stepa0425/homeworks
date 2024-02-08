package by.it_academy.homeworks.hw11.Practice.webShop;

public class OrderItem {
    private int cost;
    private String name;

    public OrderItem(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    private void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
