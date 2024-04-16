package by.it_academy.homeworks.lesson18.collision.fix.event;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        // Создаем и запускаем потоки чтения и записи
        Thread writerThread = new Thread(() -> {
            try {
                resource.write("Hello, World!");
            } catch (InterruptedException e) {}
        });

        Thread readerThread = new Thread(() -> {
            try {
                String message = resource.read();
                System.out.println("Message read from resource: " + message);
            } catch (InterruptedException e) {}
        });

        readerThread.start();
        //Thread.sleep(2000);
        writerThread.start();
    }
}

class SharedResource {
    private String message;
    private boolean written = false;

    public synchronized void write(String message) throws InterruptedException {
        while (written) {
            System.out.println("write()");
            wait(); // Ждем, пока не прочитают сообщение
        }

        this.message = message;
        written = true;
        System.out.println("Message written to resource: " + message);
        notify(); // Уведомляем поток чтения, что можно прочитать сообщение
    }

    public synchronized String read() throws InterruptedException {
        while (!written) {
            System.out.println("read() is waiting until write()");
            wait(); // Ждем, пока не запишут сообщение
        }

        String message = this.message;
        written = false;
        notify(); // Уведомляем поток записи, что можно записать новое сообщение
        return message;
    }
}