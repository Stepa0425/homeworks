package by.it_academy.homeworks.lesson21.patterns.hw;

public class Earth {
    private static Earth instance;

    private Earth(){
    }
    public static synchronized Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
