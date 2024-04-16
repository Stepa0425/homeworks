package by.it_academy.homeworks.lesson27.Task2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> marks;

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public static Student parseToStudent(String studentStr, String regexForStudent, String regexForMarks) {
        String[] student = studentStr.split(regexForStudent);
        return new Student(student[0], parseMarks(student[1],regexForMarks));
    }

    public static List<Integer> parseMarks(String marksStr, String regex) {
        List<Integer> marksInt = new ArrayList<>();
        String[] marks = marksStr.split(regex);
        for (String el : marks) {
            Integer mark = Integer.valueOf(el);
            marksInt.add(mark);
        }
        return marksInt;
    }

    public double getAverageMark(){
        return marks.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", average mark=" + getAverageMark() +
                '}';
    }
}
