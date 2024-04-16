package by.it_academy.homeworks.lesson21.patterns.command;

public class RemoteControl {
    private Command[] commands;

    public RemoteControl() {
        commands = new Command[5];//У нашего пульта 5 кнопок
    }

    public void setCommands(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        if (commands[slot] != null) {
            commands[slot].execute();
        }
    }
}
