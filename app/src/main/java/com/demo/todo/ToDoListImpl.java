package com.demo.todo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.demo.todo.Task.Field;

public class ToDoListImpl implements ToDoList {
    public ToDoListImpl() {
    }

    @Override
    public Task add(Integer id, LocalDateTime dateTime, String location, String description) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public List<Task> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public List<Task> findAll(boolean completed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public List<Task> findAll(LocalDateTime from, LocalDateTime to, Boolean completed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public List<Task> findAll(Map<Field, String> params, LocalDateTime from, LocalDateTime to, Boolean completed,
            boolean andSearch) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Task findOne(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public boolean remove(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

}
