package by.it_academy.homeworks.lesson25.customAnnotation.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {
    String stringValue();

    int intValue();
}
