package by.it_academy.homeworks.lesson21.patterns.hw;

public class Earth implements CosmicBody {
    private static Earth instance;

    private Earth(){
    }
    public static synchronized Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }

    @Override
    public void makeTurn() {
        System.out.println("The Earth has made one revolution around its axis");
    }

    @Override
    public void moveRelative() {
        System.out.println("The Earth moves relative to the rest of the cosmic bodies");
    }
}
