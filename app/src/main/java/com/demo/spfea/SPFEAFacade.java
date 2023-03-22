package com.demo.spfea;

import java.time.LocalDateTime;
import java.util.List;

import com.demo.todo.Task;
import com.demo.todo.ToDoList;

public interface SPFEAFacade {

    int addCustomer(String fName, String lName, String phone, String email);

    Task addNewTask(LocalDateTime dateTime, String description, String location);

    void completeTask(int id);

    List<String> getAllCustomers();

    List<Task> getAllTasks();

    String getCustomerEmail(int id);

    Integer getCustomerID(String fName, String lName);

    String getCustomerPhone(int id);

    void removeCustomer(int id);

    void setCustomerEmail(int id, String email);

    void setCustomerPhone(int id, String phone);

    void setToDoProvider(ToDoList provider);

}
