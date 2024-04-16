package by.it_academy.homeworks.lesson22.solid.isp.fix;

public class Dog implements Walker,Swimmer{
    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}
