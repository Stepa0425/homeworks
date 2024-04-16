package by.it_academy.homeworks.lesson25.hw.Task2;

public class CallOld {
    @SuppressWarnings("deprecation")
    public void printOld() {
        TestAnnotation callOld = new TestAnnotation();
        System.out.println("Result old method: " + callOld.old());
    }
}
