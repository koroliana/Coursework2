package service;

import tasks.Task;

import java.time.LocalDate;
import java.util.*;

public class TaskService {
    private static Map<Integer, Task> taskMap = new HashMap<>();
    private static Collection<Task> removedTasks = new ArrayList<>() ;

    public void add (Task newTask) {
        taskMap.put(newTask.getId(),newTask);
    }

    public Task remove (int key) {
        Task removedTask = taskMap.get(key);
        removedTasks.add(removedTask);
        taskMap.remove(key);
        return removedTask;
    }

    public Collection<Task> getAllByDate(LocalDate localDate) {
        Collection<Task> tasksByDate = new ArrayList<>();
        for (Task value: taskMap.values()) {
            if(value.appearsIn(localDate)) {
               tasksByDate.add(value);
            }
        }
        return tasksByDate;
    }

}
