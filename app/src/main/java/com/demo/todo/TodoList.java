package com.demo.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<ToDo> items;

    public TodoList() {
        items = new ArrayList<>();
    }

    public void addItem(ToDo item) {
        items.add(item);
    }

    public void removeItem(ToDo item) {
        items.remove(item);
    }

    public void clearList() {
        items.clear();
    }

    public int getSize() {
        return items.size();
    }

    public boolean containsItem(ToDo item) {
        return items.contains(item);
    }

    public List<ToDo> getItems() {
        return items;
    }
}
