package by.it_academy.homeworks.lesson21.patterns.hw;

public class Sun {
    private static Sun instance;

    private Sun() {
    }

    public static synchronized Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
