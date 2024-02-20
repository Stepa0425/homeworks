package by.it_academy.homeworks.lesson14.practice.task.manager;

public class TaskManager {
    public static void performTask(Task task, TaskAction action) {
        System.out.println("Performing action on task with ID " + task.getId());
        action.performAction(task);
        System.out.println("Finished performing action on task with ID " + task.getId());
    }
}