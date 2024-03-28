package by.it_academy.homeworks.lesson21.patterns.command;

public class TurnOnCommand implements Command {
    private Television television;

    public TurnOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}
