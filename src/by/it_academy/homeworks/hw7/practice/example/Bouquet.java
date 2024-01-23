package by.it_academy.homeworks.hw7.practice.example;

import java.util.Arrays;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public double getBouquetPrice() {
        double sumPrice = 0;
        for (Flower flower : flowers) {
            sumPrice += flower.getPrice();
        }
        return sumPrice;
    }

    public String[] getColorsBouquet() {
        String[] colors = new String[flowers.length];
        for (int i = 0; i < colors.length; i++) {
            colors[i] = flowers[i].getColor();
        }
        return colors;
    }

    public String[] getUniqColors() {
        String[] colors = this.getColorsBouquet();
        String[] uniqColors = new String[colors.length];
        Arrays.sort(colors);
        for (int i = 0, uniqColorsIndex = 0; i < colors.length; i++) {
            for (int j = i; j < uniqColors.length - 1; j++) {
                if (!colors[j + 1].equals(colors[j])) {
                    uniqColors[uniqColorsIndex++] = colors[j];
                }
            }
        }
        return uniqColors;
    }

    public int getMaxDaysLife() {
        int max = 0;
        for (Flower flower : flowers) {
            if (max < flower.getLifeExpectancyInDays()) {
                max = flower.getLifeExpectancyInDays();
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "Bouquet{" + Arrays.toString(flowers) +
                '}';
    }
    //public void addFlower()
}
