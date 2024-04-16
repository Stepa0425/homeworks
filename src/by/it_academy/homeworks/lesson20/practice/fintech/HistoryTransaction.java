package by.it_academy.homeworks.lesson20.practice.fintech;
import java.io.FileWriter;
import java.io.IOException;
public class HistoryTransaction {
    private String pathOfHistory;

    public HistoryTransaction(String pathOfHistory) {
        this.pathOfHistory = pathOfHistory;
    }

    public void saveTransaction(Transaction transaction) {
        try (FileWriter writer = new FileWriter(pathOfHistory, true)) {
            writer.write(transaction.serialize() + "\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
