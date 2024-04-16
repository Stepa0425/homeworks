package by.it_academy.homeworks.lesson22.solid.dip.violation;

public class LightBulb {
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Light is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is off");
    }
}
