package by.it_academy.homeworks.lesson13.practice.TextTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("resources/lesson13/text.txt"))) {
            String line;
            // если line = null -> конец файла
            while ((line = br.readLine()) != null) {
                int result = countOfWords(line);
                System.out.println(result);
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        }
    }
    public static int countOfWords (String line){
        String stringPattern = "\\s";
        String value = "line";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(line);
        int count = 1;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
