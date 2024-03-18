package by.it_academy.homeworks.lesson20.practice.fintech;

public class BankPlatform implements Runnable{

    private Buffer buffer;
    private HistoryTransaction historyTransaction = new HistoryTransaction("resources/lesson21/history.txt");

    public BankPlatform(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true){
            try {
                Transaction getTransaction = buffer.getTransaction();
                Thread.sleep(1500);
                historyTransaction.saveTransaction(getTransaction);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
