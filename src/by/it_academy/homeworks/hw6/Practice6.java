package by.it_academy.homeworks.hw6;

public class Practice6 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setEducationYear(2024);
        student.incrementEducationYear();
        System.out.println(student.getEducationYear());
    }
}
