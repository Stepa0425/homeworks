package by.it_academy.homeworks.lesson25.hw.Task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*Изучение класса. загрузите класс java.util.HashMap. Выведите
все поля класса, родительский класс, методы класса,
конструкторы. Выведите информацию о внутренних классах,
если они есть*/
public class HashMapAnalyze {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> hashmap = Class.forName("java.util.HashMap");

        System.out.println("Fields:");
        Field[] fields = hashmap.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("\nParent class:" + hashmap.getSuperclass());

        System.out.println("\nMethods:");
        Method[] methods = hashmap.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("\nConstructors:");
        Constructor<?>[] constructors = hashmap.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("\nInner classes:");
        Class<?>[] innerClasses = hashmap.getDeclaredClasses();
        for (Class clas : innerClasses) {
            System.out.println(clas);
        }
    }
}
