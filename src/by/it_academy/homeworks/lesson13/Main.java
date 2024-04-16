package by.it_academy.homeworks.lesson13;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("resources/lesson13/to-write.txt");
            fileWriter.write("We are writing an info to the file!!!!!!!");
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        } finally {
            fileWriter.close();
        }
    }
}