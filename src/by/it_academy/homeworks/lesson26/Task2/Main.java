package by.it_academy.homeworks.lesson26.Task2;

public class Main {
    public static void main(String[] args) {
        Weapon gun = Gun.getInstance("Glock", 20);
        Weapon blade = Sword.getInstance("Blade");
        Character mike = new Character("Mike", 100, gun);
        Character james = new Character("James", 100, blade);

        james.useWeapon(mike);
        mike.useWeapon(james);
    }
}
