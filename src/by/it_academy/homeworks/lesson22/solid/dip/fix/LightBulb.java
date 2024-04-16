package by.it_academy.homeworks.lesson22.solid.dip.fix;

public class LightBulb implements Switchable {
    private boolean isOn;

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light is on");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light is off");
    }
}
