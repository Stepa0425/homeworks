package by.it_academy.homeworks.lesson20.practice;

import java.util.UUID;

public class Pie {
    private String name;
    private UUID id;

    public Pie(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
