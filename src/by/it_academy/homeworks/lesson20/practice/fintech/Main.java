package by.it_academy.homeworks.lesson20.practice.fintech;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String PATH_OF_FILE = "resources/lesson21/history.txt";
        Buffer buffer = new Buffer();
        MobileApp mobileApp = new MobileApp(buffer);
        BankPlatform bankPlatform = new BankPlatform(buffer, PATH_OF_FILE);

        Thread mobileAppThread = new Thread(mobileApp);
        Thread bankPlatformThread = new Thread(bankPlatform);

        mobileAppThread.start();
        bankPlatformThread.start();

        List<Transaction> allTransactions = TransactionController.getAllTransactions(PATH_OF_FILE);
    }

}
