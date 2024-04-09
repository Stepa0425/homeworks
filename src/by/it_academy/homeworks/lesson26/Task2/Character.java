package by.it_academy.homeworks.lesson26.Task2;

public class Character {
    private String name;
    private int health;
    private Weapon weapon;

    public Character(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int hitCount, int damage) {
        System.out.println("Character " + name + " taking damage " + damage);
        health -= hitCount * damage;
        System.out.println("Health of character " + name + " : " + health);
    }

    public void useWeapon(Character characterToHit) {
        System.out.println("Character " + name + " attack " + characterToHit.getName());
        weapon.useWeapon(characterToHit);
        System.out.println("");
    }
}
