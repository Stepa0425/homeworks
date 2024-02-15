package by.it_academy.homeworks.lesson13.practice.filesTasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileReadWriteUtils {
    public static void main(String[] args) throws IOException {

    }

    public static void writeRandomNumbers(String relativePath, int countOfNumbers, int maxValue){
        Random random = new Random();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(relativePath))) {
            for (int i = 0; i < countOfNumbers; i++) {
                int number = random.nextInt(maxValue) + 1;
                String numberStr = String.valueOf(number);
                bw.write(numberStr);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        }
    }

    public static List<Integer> getNumbersFromFile(String relativePath) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(relativePath))) {
            String line;
            // если line = null -> конец файла
            while ((line = br.readLine()) != null) {
                int lineInt = Integer.parseInt(line);
                numbers.add(lineInt);
            }
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        }
        return numbers;
    }

    public static void writeListToFile(List<Integer> list, String relativePath){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(relativePath))) {
            for (Integer number : list) {
                String numberStr = String.valueOf(number);
                bw.write(numberStr);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        }
    }

}

