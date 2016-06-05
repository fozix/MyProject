package com.home.dao;

import java.util.List;

import com.dao.dto.ToDoDTO;
import com.home.model.ToDoList;

public interface ToDoListDAO {

    public void persist(ToDoDTO entity);
    
    public void update(ToDoDTO entity);
    
    public ToDoList findById(long id);
     
    public void delete(ToDoDTO entity);
}
