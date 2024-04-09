package by.it_academy.homeworks.lesson26.Task2;

public class Gun implements Weapon {
    public static Gun instance;
    private String name;
    private final int DAMAGE = 5;
    private int bullets;

    public static Gun getInstance(String name, int bullets) {
        if (instance == null) {
            return new Gun(name, bullets);
        }
        return instance;
    }

    private Gun(String name, int bullets) {
        this.name = name;
        this.bullets = bullets;
    }


    public int getDAMAGE() {
        return DAMAGE;
    }

    @Override
    public void useWeapon(Character character) {
        character.takeDamage(bullets, DAMAGE);
    }
}
