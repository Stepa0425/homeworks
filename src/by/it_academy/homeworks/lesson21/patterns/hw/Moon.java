package by.it_academy.homeworks.lesson21.patterns.hw;

public class Moon {
    public static Moon instance;

    private Moon() {
    }

    public static synchronized Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}
