package by.it_academy.homeworks.lesson20.practice.webshop;

import java.util.UUID;

public class Order {
    private String name;
    private UUID id;
    private int priceOfOrder;

    public Order(String name, int priceOfOrder) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.priceOfOrder = priceOfOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getPriceOfOrder() {
        return priceOfOrder;
    }

    public void setPriceOfOrder(int priceOfOrder) {
        this.priceOfOrder = priceOfOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", priceOfOrder=" + priceOfOrder +
                '}';
    }
}
