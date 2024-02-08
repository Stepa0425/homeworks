package by.it_academy.homeworks.hw11.Practice.Project;

public class MainProjects {
    public static void main(String[] args) {
        Task build = new Task("Сборка деталей", Status.IN_PROGRESS, Priority.HIGH);
        Task proccessing = new Task("Обработка деталей", Status.IN_PROGRESS, Priority.HIGH);
        Project details = new Project("Детали");
        details.addTask(build);
        details.addTask(proccessing);
        System.out.println(details.getTaskWithHighestPriority().get());


    }
}
