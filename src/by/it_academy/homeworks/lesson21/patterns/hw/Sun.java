package by.it_academy.homeworks.lesson21.patterns.hw;

public class Sun implements CosmicBody {
    private static Sun instance;

    private Sun() {
    }

    public static synchronized Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }

    @Override
    public void makeTurn() {
        System.out.println("The Sun has made one revolution around its axis");
    }

    @Override
    public void moveRelative() {
        System.out.println("The Sun moves relative to the rest of the cosmic bodies");
    }
}
