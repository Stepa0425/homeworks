package by.it_academy.homeworks.hw7.practice.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose(12, "red", 7);
        System.out.println(rose);
        Lily lily = new Lily(10, "blue", 5);
        Carnation carnation = new Carnation(9, "red", 10);
        Flower[] flowers = new Flower[]{rose, lily, carnation};
        Bouquet bouquet = new Bouquet(flowers);
        System.out.println(bouquet);
        System.out.println("Sum bouquet = " + bouquet.getBouquetPrice());
        System.out.println("Colors of bouquet = " + Arrays.toString(bouquet.getColorsBouquet()));

        System.out.println("The unique colors of the bouquet = " + Arrays.toString(bouquet.getUniqColors()));
        System.out.println("The bouquet expires in " + bouquet.getMaxDaysLife() + " days.");

    }

}
