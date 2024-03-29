package by.it_academy.homeworks.lesson22.solid.dip.fix;

public class LightSwitch {
    private Switchable switchable;

    public LightSwitch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void toogle() {
        if (switchable.isOn()) {
            switchable.turnOff();
        } else {
            switchable.turnOn();
        }
    }
}
