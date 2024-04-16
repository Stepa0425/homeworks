package by.it_academy.homeworks.lesson13.hw13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public class TextFilesUtils {

    public static int getQuantityOfWords(String relativePath) {
        validateExtension(relativePath, ".txt");
        return processFile(relativePath, TextFilesUtils::countOfWords);
    }

    public static int getQuantityOfPunctuationMarks(String relativePath) {
        validateExtension(relativePath, ".txt");
        return processFile(relativePath, TextFilesUtils::countOfPunctuationMarks);
    }

    private static int processFile(String relativePath, Function<String, Integer> countFunction){
        int quantity = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(relativePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                quantity += countFunction.apply(line);
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
