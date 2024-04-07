package by.it_academy.homeworks.lesson25.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        MyClass myObject = new MyClass();
        Class<? extends MyClass> myClass = myObject.getClass();

        int modifiers = myClass.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            System.out.println("public");
        }
        if (Modifier.isPrivate(modifiers)) {
            System.out.println("private");
        }
        if (Modifier.isProtected(modifiers)) {
            System.out.println("protected");
        }
        if(Modifier.isStatic(modifiers)){
            System.out.println("public");
        }

        Class linkedListClass = MyClass.class;
        Class[] interfaces = linkedListClass.getInterfaces();
        System.out.println("Implemented by linkedList interfaces:");
        for(Class cInterface : interfaces){
            System.out.println(cInterface.getName());
        }

        //Загрузка и динамическое создание экземпляра класса
        Class hashSetClass = Class.forName("java.util.HashSet");
        Object createdHashSet = hashSetClass.getDeclaredConstructor().newInstance();

        System.out.println(createdHashSet);

    }
}
