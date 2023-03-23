package com.demo.spfea;

import java.time.LocalDateTime;
import java.util.List;

import com.demo.todo.Task;
import com.demo.todo.ToDoList;

public class SPFEAFacadeImpl implements SPFEAFacade {

    @Override
    public int addCustomer(String fName, String lName, String phone, String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
    }

    @Override
    public Task addNewTask(LocalDateTime dateTime, String description, String location) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNewTask'");
    }

    @Override
    public void completeTask(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'completeTask'");
    }

    @Override
    public List<String> getAllCustomers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
    }

    @Override
    public List<Task> getAllTasks() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTasks'");
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
