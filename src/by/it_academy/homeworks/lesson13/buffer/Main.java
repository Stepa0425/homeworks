package by.it_academy.homeworks.lesson13.buffer;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //можем писать по кусочкам
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("resources/to-write-buffer.txt"))) {
            bw.write("line 1");
            bw.newLine();
            bw.write("line 2");
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        }

        try (BufferedReader br = new BufferedReader(new FileReader("resources/to-write-buffer.txt"))) {
            String line;
            // если line = null -> конец файла
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        }
    }
}