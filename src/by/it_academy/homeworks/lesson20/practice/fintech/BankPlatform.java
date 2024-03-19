package by.it_academy.homeworks.lesson20.practice.fintech;

public class BankPlatform implements Runnable{

    private Buffer buffer;
    private String pathOfHistory;
    private HistoryTransaction historyTransaction = new HistoryTransaction(pathOfHistory);

    public BankPlatform(Buffer buffer, String pathOfHistory) {
        this.buffer = buffer;
        this.pathOfHistory = pathOfHistory;
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
