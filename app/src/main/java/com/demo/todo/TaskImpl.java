package com.demo.todo;

import java.time.LocalDateTime;

public class TaskImpl implements Task {
    private int id;
    private LocalDateTime dateTime;
    private String location;
    private String description;
    private boolean isCompleted;

    public TaskImpl(int id, LocalDateTime dateTime, String location, String description) {
        this.id = id;
        this.dateTime = dateTime;
        this.location = location;
        this.description = description;
    }

    @Override
    public void complete() {
        this.isCompleted = true;
    }

    @Override
    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String getField(Field field) {
        return field.toString();
    }

    @Override
    public boolean isCompleted() {
        return this.isCompleted;
    }

    @Override
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;

    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public int getID() {
        return this.id;
    }

}
