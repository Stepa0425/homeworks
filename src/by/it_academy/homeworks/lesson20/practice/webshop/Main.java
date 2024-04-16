package by.it_academy.homeworks.lesson20.practice.webshop;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Thread firmThread = new Thread(new Firm(storage));
        Thread internetShopThread = new Thread(new InternetStore(storage));

        firmThread.start();
        internetShopThread.start();
    }
}
