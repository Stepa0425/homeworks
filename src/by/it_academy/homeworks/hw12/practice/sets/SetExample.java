package by.it_academy.homeworks.hw12.practice.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample  {
    public static void main(String args[]) {
        Integer[] integers1 = {22, 45, 33, 66, 55, 34, 77};
        Integer[] integers2 = {33, 2, 83, 45, 3, 12, 55};

        Set<Integer> integersSet1 = new HashSet<>();
        integersSet1.addAll(Arrays.asList(integers1));
        Set<Integer> integersSet2 = new HashSet<>();
        integersSet2.addAll(Arrays.asList(integers2));

        // Finding Union of integersSet1 and integersSet2
        Set<Integer> setsUnion = new HashSet<>(integersSet1);
        setsUnion.addAll(integersSet2);
        //Union of integersSet1 and integersSet2 is: [33, 66, 34, 2, 83, 3, 22, 55, 12, 45, 77]
        System.out.println("Union of integersSet1 and integersSet2 is: " + setsUnion);
// Finding Intersection of integersSet1 and integersSet2
        Set<Integer> setsIntersection = new HashSet<>(integersSet1);
        setsIntersection.retainAll(integersSet2);
        //Intersection of integersSet1 and integersSet2 is: [33, 55, 45]
        System.out.println("Intersection of integersSet1 and integersSet2 is: " + setsIntersection);

        // Finding integersSet1 unique elements, which are not contained in integersSet2
        Set<Integer> setsDifference = new HashSet<>(integersSet1);
        setsDifference.removeAll(integersSet2);
        //Difference of integersSet1 and integersSet2 is: [66, 34, 22, 77]
        System.out.println("Difference of integersSet1 and integersSet2 is: " + setsDifference);
    }
}
