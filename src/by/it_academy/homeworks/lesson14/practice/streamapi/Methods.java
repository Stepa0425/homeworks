package by.it_academy.homeworks.lesson14.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        List<String> students = Arrays.asList(
                "James",
                "Alice",
                "Robert",
                "Bob",
                "Charlie",
                "John",
                "William",
                "Richard"
        );

        //filter
        List<String> studentsStartsWithR = students.stream()
                .filter(name -> name.startsWith("R"))
                .toList();
        System.out.println(studentsStartsWithR);

        //map
        List<Character> studentsFirstChar = students.stream()
                .map(name -> name.toCharArray()[0])
                .toList();
        System.out.println(studentsFirstChar);

        //distinct
        List<String> studentsDistinct = students.stream()
                .distinct()
                .toList();
        System.out.println(studentsDistinct);
        //sorted
        List<String> studentsSorted = students.stream()
                .sorted()
                .toList();
        System.out.println(studentsSorted);

        //limit
        List<String> studentsLimit3 = students.stream()
                .limit(3)
                .toList();
        System.out.println(studentsLimit3);

        //skip
        List<String> studentsSkip3 = students.stream()
                .skip(3)
                .toList();
        System.out.println(studentsSkip3);

        //forEach
        students.forEach(System.out::println);
        //toArray
        Object[] studentsArray = students.stream().toArray();
        System.out.println(Arrays.toString(studentsArray));

        //reduce
        String studentsReduce = students.stream()
                .reduce((word1, word2) ->word1 + word2)
                .orElse("");
        System.out.println(studentsReduce);

        //collect
        Map<String, String> collect = students.stream()
                .collect(Collectors.toMap(
                        student -> student.substring(0, 2),
                        student -> student
                ));
        System.out.println(collect);

        //min
        Optional<String> min = students.stream()
                .min(String::compareTo);
        System.out.println(min);

        //max
        Optional<String> max = students.stream()
                .max(String::compareTo);
        System.out.println(max);
        //count
        long count = students.stream().count();
        System.out.println(count);

        //anyMatch
        boolean anyStartsWithR = students.stream()
                .anyMatch(name -> name.startsWith("R"));
        System.out.println(anyStartsWithR);

        //allMatch
        boolean allStartsWithR = students.stream()
                .allMatch(name -> name.startsWith("R"));
        System.out.println(allStartsWithR);

        //noneMatch
        boolean noneStartsWithR = students.stream()
                .noneMatch(name -> name.startsWith("R"));
        System.out.println(noneStartsWithR);
        //findFirst
        Optional<String> first = students.stream()
                .findFirst();
        System.out.println(first);

        //findAny
        Optional<String> any = students.stream()
                .findAny();
        System.out.println(any);
    }
}