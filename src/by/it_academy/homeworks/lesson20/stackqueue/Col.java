package by.it_academy.homeworks.lesson20.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Col {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(100);
        deque.push(123);
        deque.push(25);

        System.out.println("Deque size = " + deque.size());

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
    }
}
