package by.it_academy.homeworks.lesson25.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LinkedListAnalyze {
    public static void main(String[] args) {
        try {
            //Загрузка класса
            Class<?> linkedListClass = Class.forName("java.util.LinkedList");

            //Вывод информации о его полях
            System.out.println("\nFields:");
            Field[] fields = linkedListClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }

            //Вывод родительских классов
            System.out.println("\nParent class:");
            System.out.println(linkedListClass.getSuperclass());

            //Вывод информации о его методах
            System.out.println("\nMethods:");
            Method[] methods = linkedListClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

            //Вывод информации о конструкторах класса
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = linkedListClass.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor);
            }

            System.out.println("\nClasses in LinkedListClass:");
            Class<?>[] innerClasses = linkedListClass.getDeclaredClasses();
            for (Class clas : innerClasses) {
                System.out.println(clas);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
