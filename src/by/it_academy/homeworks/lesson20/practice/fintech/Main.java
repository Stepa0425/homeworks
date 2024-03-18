package by.it_academy.homeworks.lesson20.practice.fintech;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        MobileApp mobileApp = new MobileApp(buffer);
        BankPlatform bankPlatform = new BankPlatform(buffer);

        Thread mobileAppThread = new Thread(mobileApp);
        Thread bankPlatformThread = new Thread(bankPlatform);

        mobileAppThread.start();
        bankPlatformThread.start();
    }

}
