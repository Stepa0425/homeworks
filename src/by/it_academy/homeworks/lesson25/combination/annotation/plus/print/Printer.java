package by.it_academy.homeworks.lesson25.combination.annotation.plus.print;

import java.lang.reflect.Field;

public class Printer {

    public static void print(Object object) {

        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Printable.class)) {
                field.setAccessible(true);
                try {
                    System.out.println(field.getName() + ": " + field.get(object));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
