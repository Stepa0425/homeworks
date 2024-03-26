package by.it_academy.homeworks.lesson20.practice;

public class Procces {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        Baker baker = new Baker(bakery);
        Seller seller = new Seller(bakery);

        Thread bakerThread = new Thread(baker);
        Thread sellerthread = new Thread(seller);

        bakerThread.start();
        sellerthread.start();
    }
}
