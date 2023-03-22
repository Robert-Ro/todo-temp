package com.demo.todo;

import java.time.LocalDateTime;

public interface Task {
    public enum Field {
        DESCRIPTION,
        LOCATION
    }

    void complete();

    String getField(Task.Field field);

    void setDescription(java.lang.String description);

    void setLocation(java.lang.String location);

    void setDateTime(LocalDateTime dateTime);

    boolean isCompleted();

    String getDescription();

    String getLocation();

    LocalDateTime getDateTime();

    int getID();
}
