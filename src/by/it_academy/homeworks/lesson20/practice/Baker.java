package by.it_academy.homeworks.lesson20.practice;

public class Baker implements Runnable {

    private Bakery bakery;

    public Baker(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        while (true) {
            Pie applePie = new Pie("applePie");
            try {
                bakery.put(applePie);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
