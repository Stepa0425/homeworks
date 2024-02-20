package by.it_academy.homeworks.lesson14.practice.task.manager;

@FunctionalInterface
public interface TaskAction {
    void performAction(Task task);
    // t -> {...};
}