package by.it_academy.homeworks.lesson27.Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/*4. Создайте программу, которая считывает данные из файла данных и выводит обработанные данные.
Файл данных students.csv содержит список студентов (каждый в отдельной строке) в виде:

имя;оценки
Оценки - это данные, представляющие оценки в форме:

1 2 1 3 4
или
1, 2, 1, 3, 4
или
1 2,1,3 4,

(неизвестное количество знаков, разделенных пробелом и/или запятой)

Файл данных не содержит заголовка.
Программа выводит имя, фамилию и средний балл студента. Если при запуске программы не указан аргумент,
то вывод будет осуществляться в исходном порядке загрузки.
Если указан аргумент "sort", вывод будет отсортирован в порядке возрастания среднего балла.*/

public class Main {
    public static void main(String[] args) {
        final String PATH_TO_FILE = "resources/lesson27/students.csv";
        List<Student> students = readFile(PATH_TO_FILE);
        printStudents(students);

    }

    public static List<Student> readFile(String pathToFile) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                Student student = Student.parseToStudent(line, ";",  "[,\\s]+");
                students.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public static void printStudents(List<Student> students){
        students.forEach(System.out::println);
    }
    public static void printStudents(List<Student> students,Direction sort){
        switch (sort){
            case ASC -> students.stream()
                    .sorted(Comparator.comparing(Student::getAverageMark))
                    .toList()
                    .forEach(System.out::println);
            case DESC -> students.stream()
                    .sorted(Comparator.comparing(Student::getAverageMark))
                    .toList()
                    .reversed()
                    .forEach(System.out::println);
        }
    }
}
