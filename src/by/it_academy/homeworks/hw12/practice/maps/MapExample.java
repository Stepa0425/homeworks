package by.it_academy.homeworks.hw12.practice.maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // HashMap<String, Integer> map = new TreeMap<>();

        map.put("A", 6);
        map.put("A-", 2);
        map.put("B", 9);
        //Initial map: {A=6, B=9, A-=2}
        System.out.println("Initial map: " + map);

        map.putIfAbsent("C", 7);
        map.putIfAbsent("B", 11);

        //Map after putIfAbsent: {A=6, B=9, C=7, A-=2}
        System.out.println("Map after putIfAbsent: " + map);

        //F=null
        System.out.println("F=" + map.get("F"));
        //A=6
        System.out.println("A=" + map.get("A"));

        //Contains key "C"? true
        System.out.println("Contains key \"C\"? " + map.containsKey("C"));
    }
}
