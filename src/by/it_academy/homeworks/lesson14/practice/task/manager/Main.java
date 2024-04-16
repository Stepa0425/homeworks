package by.it_academy.homeworks.lesson14.practice.task.manager;

public class Main {

    /*
    Создать систему, которая позволит пользователям добавлять новые задачи, удалять существующие и выполнять действия над задачами с помощью функциональных интерфейсов и лямбда-выражений.
Создайте экземпляры задач, определите действия над ними с помощью лямбда-выражений и передайте их методу performTask
     */
    public static void main(String[] args) {
        Task homework = new Task("Do a homework", "Postponed");
        Task washTheDishes = new Task("Wash the dishes", "In progress");

        TaskAction doAHomework = task -> {
            System.out.println("I've started to do my homework");
            homework.setStatus("In progress");
            System.out.println("I'm tired...'");
        };
        TaskAction professionallyWashTheDishes = task -> {
            System.out.println("Washing the dishes");
            System.out.println("That's all!!!");
            washTheDishes.setStatus("Finished");
        };

        TaskManager.performTask(homework, doAHomework);
        System.out.println("\n\n");
        TaskManager.performTask(washTheDishes, professionallyWashTheDishes);
    }
}