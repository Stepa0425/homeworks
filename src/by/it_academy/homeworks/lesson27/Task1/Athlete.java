package by.it_academy.homeworks.lesson27.Task1;

import java.time.Duration;
import java.time.LocalTime;

public class Athlete {
    private String name;
    private String surName;
    private LocalTime start;
    private LocalTime finish;

    public Athlete(String name, String surName, LocalTime start, LocalTime finish) {
        this.name = name;
        this.surName = surName;
        this.start = start;
        this.finish = finish;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getFinish() {
        return finish;
    }

    public static Athlete parseToAthlete(String AthleteStr, String strRegex) {
        String[] athleteStr = AthleteStr.split(strRegex);
        LocalTime startTime = LocalTime.parse(athleteStr[2]);
        LocalTime finishTime = LocalTime.parse(athleteStr[3]);
        return new Athlete(athleteStr[0], athleteStr[1], startTime, finishTime);
    }

    public Long getTotalTIme() {
        return Duration.between(start, finish).toMillis();
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", totalTime = " + getTotalTIme() +
                " milliseconds" +
                '}';
    }
}
