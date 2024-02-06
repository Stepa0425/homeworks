package by.it_academy.homeworks.hw9;

public class Task1 {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new Pair<>(4 ,5);
        System.out.println(pair);

        pair.swap();
        System.out.println(pair);

        pair.replaceFirst(10);
        System.out.println(pair);
    }
}
