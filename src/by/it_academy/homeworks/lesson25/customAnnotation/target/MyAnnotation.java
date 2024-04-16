package by.it_academy.homeworks.lesson25.customAnnotation.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.PARAMETER,/*ElementType.TYPE*/})
public @interface MyAnnotation {
    String value();
}
