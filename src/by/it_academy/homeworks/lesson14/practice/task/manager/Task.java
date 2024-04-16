package by.it_academy.homeworks.lesson14.practice.task.manager;

import java.util.UUID;

public class Task {
    private UUID id;
    private String description;
    private String status;

    public Task(String description, String status) {
        this.id = UUID.randomUUID();
        this.description = description;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}