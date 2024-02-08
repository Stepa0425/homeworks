package by.it_academy.homeworks.hw11.Practice.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Project {
    private List<Task> tasks = new ArrayList<>();

    private String name;

    public Project(String name) {
        this.name = name;
    }

    public void addTask(Task newTask) {
        tasks.add(newTask);
    }
    public Optional<Task> getTaskWithHighestPriority(){
        for (Task task: tasks){
            if(task.getPriority().equals(Priority.HIGH)){
              return  Optional.of(task);
            }
        }
        return Optional.empty();
    }

}
