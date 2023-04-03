package tasks;

import java.time.LocalDateTime;

public class Task {
    private int idGenerator;
    private String description;
    private LocalDateTime dateTime;
    private Type type;
    private String title;
    private int id;

    public Task(String description, Type type, String title) {
        this.description = description;
        this.type = type;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Type getType() {
        return type;
    }
}
