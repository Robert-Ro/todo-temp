package com.demo.todo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.demo.todo.Task.Field;

public class ToDoListImpl implements ToDoList {
    private List<Task> tasks = new ArrayList<>();

    public ToDoListImpl() {
    }

    @Override
    public Task add(Integer id, LocalDateTime dateTime, String location, String description) {
        Task task = new TaskImpl(id, dateTime, location, description);
        this.tasks.add(task);
        return task;
    }

    @Override
    public void clear() {
        tasks.clear();
    }

    @Override
    public List<Task> findAll() {
        return this.tasks;
    }

    @Override
    public List<Task> findAll(boolean completed) {
        ArrayList<Task> tasks = new ArrayList<Task>();
        this.tasks.forEach(task -> {
            if (task.isCompleted() == completed) {
                tasks.add(task);
            }
        });
        return tasks;
    }

    @Override
    public List<Task> findAll(LocalDateTime from, LocalDateTime to, Boolean completed) {
        ArrayList<Task> tasks = new ArrayList<Task>();
        this.tasks.forEach(task -> {
            if (task.isCompleted() == completed && task.getDateTime().isAfter(from)
                    && task.getDateTime().isBefore(to)) {
                tasks.add(task);
            }
        });
        return tasks;
    }

    @Override
    public List<Task> findAll(Map<Field, String> params, LocalDateTime from, LocalDateTime to, Boolean completed,
            boolean andSearch) {
        // TODO
        ArrayList<Task> tasks = new ArrayList<Task>();
        this.tasks.forEach(task -> {
            if (task.isCompleted() == completed && task.getDateTime().isAfter(from)
                    && task.getDateTime().isBefore(to)) {
                tasks.add(task);
            }
        });
        return tasks;
    }

    @Override
    public Task findOne(int id) {
        for (Task t : tasks) {
            if (t.getID() == id) {
                return t;
            }
        }
        return null;
    }

    @Override
    public boolean remove(int id) {
        for (Task t : tasks) {
            if (t.getID() == id) {
                tasks.remove(t);
                return true;
            }
        }
        return false;
    }

}
