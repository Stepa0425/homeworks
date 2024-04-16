package by.it_academy.homeworks.lesson26.Task2;

public class Sword implements Weapon {
    public static Sword instance;

    public static Sword getInstance(String name) {
        if (instance == null) {
            return new Sword(name);
        }
        return instance;
    }

    private String name;
    private final int DAMAGE = 10;

    private Sword(String name) {
        this.name = name;
    }

    @Override
    public void useWeapon(Character character) {
        character.takeDamage(1, DAMAGE);
    }
}
