package by.it_academy.homeworks.lesson20.practice;

public class Seller implements Runnable{
    private Bakery bakery;

    public Seller(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        while (true) {
            try {
                bakery.get();
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
