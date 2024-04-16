package by.it_academy.homeworks.lesson21.patterns.hw;

public class Moon implements CosmicBody {
    public static Moon instance;

    private Moon() {
    }

    public static synchronized Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
    @Override
    public void makeTurn() {
        System.out.println("The Moon has made one revolution around its axis");
    }

    @Override
    public void moveRelative() {
        System.out.println("The Moon moves relative to the rest of the cosmic bodies");
    }
}
