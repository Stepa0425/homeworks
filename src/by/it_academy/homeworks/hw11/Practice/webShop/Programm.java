package by.it_academy.homeworks.hw11.Practice.webShop;

public class Programm {
    public static void main(String[] args) {
        OrderItem car = new OrderItem(4568, "Car");
        OrderItem trailer = new OrderItem(458, "Trailer");
        Order order = new Order(1);
        order.addItem(car);
        order.addItem(trailer);
        System.out.println("Total cost of order is " + order.getGeneralCost());

        InternetShop shop = new InternetShop();
        shop.addOrder(order);

    }
}
