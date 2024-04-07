package by.it_academy.homeworks.lesson25.combination.annotation.plus.print.validation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ObjectValidator {
    public static boolean validate(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            Annotation[] annotations = field.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation.annotationType() == ValidName.class) {
                    String name = (String) field.get(object);
                    if (name == null || name.isEmpty()) {
                        return false;
                    } else if (annotation.annotationType() == ValidAge.class) {

                        ValidAge validAge = (ValidAge) annotation;
                        int age = field.getInt((object));
                        if (age < validAge.min() || age >= validAge.max()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
