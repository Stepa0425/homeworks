package by.it_academy.homeworks.lesson18.collision.hw;

import java.util.List;
import java.util.Optional;

public class GetMinOrMaxThread extends Thread {
    private List<Integer> array;
    private Optional<Integer> findNumber;
    private int value;

    public GetMinOrMaxThread(List<Integer> array, int maxOrMin) {
        this.array = array;
        this.value = maxOrMin;
    }

    @Override
    public void run() {
        switch (value) {
            case 0 -> findNumber = array.stream()
                    .min(Integer::compareTo);
            case 1 -> findNumber = array.stream()
                    .max(Integer::compareTo);
            default -> System.out.println("Incorrect value " + value + "!!!");
        }
    }

    public Optional<Integer> getFindNumber() {
        return findNumber;
    }
}
