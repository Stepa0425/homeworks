package by.it_academy.homeworks.lesson13.hw13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFilesUtils {

    public static int getQuantityOfWords(String relativePath) {
        int quantity = 0;
        if (!relativePath.endsWith(".txt")) {
            throw new RuntimeException("The file hasn't extension txt.");
        }
        try (BufferedReader br = new BufferedReader(new FileReader(relativePath))) {
            String line;
            // если line = null -> конец файла
            while ((line = br.readLine()) != null) {
                quantity += countOfWords(line);
            }
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        }
        return quantity;
    }

    public static int getQuantityOfPunctuationMarks(String relativePath) {
        int quantity = 0;
        if (!relativePath.endsWith(".txt")) {
            throw new RuntimeException("The file hasn't extension .txt .");
        }
            try (BufferedReader br = new BufferedReader(new FileReader(relativePath))) {
                String line;
                // если line = null -> конец файла
                while ((line = br.readLine()) != null) {
                    quantity += countOfPunctuationMarks(line);
                }
            } catch (IOException e) {
                System.out.println("Exception with message " + e.getMessage() + " occurred");
            }

        return quantity;
    }

    public static int countOfWords(String line) {
        String stringPattern = "\\s";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(line);
        int count = 1;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static int countOfPunctuationMarks(String line) {
        String stringPattern = "[,\\.;:\\-!?]";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(line);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
