package by.it_academy.homeworks.hw11.Practice.Project;

import java.util.UUID;

//Программу для управления задачами в проекте.
//Описать задачу. Каждая задача характеризуется уникальным идентификатором, описанием, статусом (например, "выполнена", "в процессе выполнения", "ожидает выполнения") и приоритетом. Ваша задача - создать класс Task, который будет представлять задачу в проекте
//Описать проект. Каждый проект имеет название, содержит список задач
public class Task {
    private UUID id;
    private String name;
    private Status status;
    private Priority priority;

    public Task( String name, Status status, Priority priority) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.status = status;
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
}
