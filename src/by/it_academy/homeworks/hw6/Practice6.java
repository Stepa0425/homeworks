package by.it_academy.homeworks.hw6;

public class Practice6 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setEducationYear(2024);
        student.incrementEducationYear();
        System.out.println(student.getEducationYear());

        //Phone p4 = new Phone();

        Phone p1 = new Phone("375445234978", "Samsung Galaxy S23", 140);
        Phone p2 = new Phone("375338579213", "Xiaomi Redmi 12 Plus", 167);
        Phone p3 = new Phone("375295478136", "Honor X9b", 156);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.receiveCall("Stepan");
        System.out.println(p1.getNumber());
        System.out.println();

        p2.receiveCall("Max");
        System.out.println(p2.getNumber());
        System.out.println();

        p3.receiveCall("Albert");
        System.out.println(p3.getNumber());
        System.out.println();

        p1.receiveCall("Alex", "375336512078");
        p2.receiveCall("Vlad", "375296896088");
        p3.receiveCall("Andrew", "375448716021");

        p1.sendMessage("375336512078", "375296896088", "375448716021");
        System.out.println();
    }
}