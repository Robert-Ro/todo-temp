package com.demo.todo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface ToDoList {
    Task add(Integer id, LocalDateTime dateTime,
            String location,
            String description);

    void clear();

    List<Task> findAll();

    List<Task> findAll(boolean completed);

    List<Task> findAll(LocalDateTime from, LocalDateTime to, Boolean completed);

    List<Task> findAll(Map<Task.Field, String> params, LocalDateTime from,
            LocalDateTime to, Boolean completed, boolean andSearch);

    Task findOne(int id);

    boolean remove(int id);

}
