package by.it_academy.homeworks.lesson21.patterns.command;

public class Main {
    public static void main(String[] args) {
        Television television = new Television();

        Command turnOffCommand = new TurnOffCommand(television);
        Command turnOnCommand = new TurnOnCommand(television);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommands(0,turnOnCommand);
        remoteControl.setCommands(1,turnOffCommand);

        remoteControl.pressButton(0);
        remoteControl.pressButton(1);
    }
}
