package by.it_academy.homeworks.lesson27.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String PATH_TO_FILE = "resources/lesson27/athletes.csv";
        List<Athlete> athletes = readFile(PATH_TO_FILE);
        List<Athlete> sortedByTotalTime = sortByTotalTime(athletes);
        printAthletes(sortedByTotalTime);
    }

    public static void printAthletes(List<Athlete> athletes) {
        athletes.stream()
                .forEach(System.out::println);
    }

    public static List<Athlete> sortByTotalTime(List<Athlete> athletes) {
        return athletes.stream()
                .sorted(Comparator.comparing(Athlete::getTotalTIme))
                .toList();
    }

    public static List<Athlete> readFile(String pathToFile) {
        List<Athlete> athletes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                Athlete athlete = Athlete.parseToAthlete(line, ";");
                athletes.add(athlete);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return athletes;
    }
}
