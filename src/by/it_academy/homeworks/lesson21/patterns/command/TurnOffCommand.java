package by.it_academy.homeworks.lesson21.patterns.command;

public class TurnOffCommand implements Command{
    private Television television;

    public TurnOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}
