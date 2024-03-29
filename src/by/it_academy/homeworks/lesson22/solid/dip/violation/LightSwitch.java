package by.it_academy.homeworks.lesson22.solid.dip.violation;

public class LightSwitch {
    private LightBulb lightBulb;

    public LightSwitch() {
        this.lightBulb = new LightBulb();
    }

    public void toggle() {
        if (lightBulb.isOn()) {
            lightBulb.turnOff();
        } else {
            lightBulb.turnOn();
        }
    }
}
