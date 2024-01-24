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
        Arrays.sort(colors);
        return removeIdenticalElements(colors);
    }

    public String[] removeIdenticalElements(String[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].equals(array[j])) {
                    for (int k = j; k < length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    length--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, length);
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
