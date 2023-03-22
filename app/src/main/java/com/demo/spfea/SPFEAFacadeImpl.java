package com.demo.spfea;

import java.time.LocalDateTime;
import java.util.List;

import com.demo.todo.Task;
import com.demo.todo.TaskImpl;
import com.demo.todo.ToDoList;

public class SPFEAFacadeImpl implements SPFEAFacade {
    private List<String> customers;
    private List<Task> tasks;
    
    @Override
    public int addCustomer(String fName, String lName, String phone, String email) {
        return 0;
    }

    @Override
    public Task addNewTask(LocalDateTime dateTime, String description, String location) {
        return new TaskImpl(0, dateTime, location, location);
    }

    @Override
    public void completeTask(int id) {

    }

    @Override
    public List<String> getAllCustomers() {
        return customers;
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public String getCustomerEmail(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerEmail'");
    }

    @Override
    public Integer getCustomerID(String fName, String lName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerID'");
    }

    @Override
    public String getCustomerPhone(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerPhone'");
    }

    @Override
    public void removeCustomer(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeCustomer'");
    }

    @Override
    public void setCustomerEmail(int id, String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCustomerEmail'");
    }

    @Override
    public void setCustomerPhone(int id, String phone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCustomerPhone'");
    }

    @Override
    public void setToDoProvider(ToDoList provider) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setToDoProvider'");
    }

}
