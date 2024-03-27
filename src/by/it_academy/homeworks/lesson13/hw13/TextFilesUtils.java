package by.it_academy.homeworks.lesson13.hw13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFilesUtils {

    public static int getQuantityOfWords(String relativePath) {
        validateExtension(relativePath, ".txt");
        int quantity = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(relativePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                quantity += countOfWords(line);
            }
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        }
        return quantity;
    }

    public static int getQuantityOfPunctuationMarks(String relativePath) {
        validateExtension(relativePath, ".txt");
        int quantity = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(relativePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                quantity += countOfPunctuationMarks(line);
            }
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        }
        return quantity;
    }

    private static void validateExtension(String path, String extension) {
        if (!path.endsWith(extension)) {
            throw new RuntimeException("The file doesn't have the " + extension + " extension.");
        }
    }

    private static int countOfWords(String line) {
        String[] words = line.split("\\s+");
        return words.length;
    }

    private static int countOfPunctuationMarks(String line) {
        int count = 0;
        for (char c : line.toCharArray()) {
            if (Character.toString(c).matches("[,.;:\\-!?]")) {
                count++;
            }
        }
        return count;
    }
}
