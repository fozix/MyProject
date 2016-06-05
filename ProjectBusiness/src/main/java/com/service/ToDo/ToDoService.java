package com.service.ToDo;

import com.dao.dto.ToDoDTO;

public interface ToDoService {

    public void saveTodo(ToDoDTO todo);
    
    public void majTodo(ToDoDTO todo);
    
    public ToDoDTO rechercheTodo(long id);
     
    public void delete(ToDoDTO entity);
}
