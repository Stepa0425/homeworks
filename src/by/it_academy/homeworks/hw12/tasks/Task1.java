package by.it_academy.homeworks.hw12.tasks;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(getCharsCount("Hey, bro, are you ready??"));
    }

    public static Map<Character, Integer> getCharsCount(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (!result.containsKey(chars[i])) {
                result.put(chars[i], 1);
            } else {
                int count = result.get(chars[i]);
                count++;
                result.put(chars[i], count);
            }
        }
        return result;
    }
}
