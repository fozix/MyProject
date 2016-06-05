package com.service.ToDo.impl;

import com.dao.dto.ToDoDTO;
import com.home.dao.ToDoListDAO;
import com.service.ToDo.ToDoService;

public class ToDoServiceImpl implements ToDoService {
	private ToDoListDAO toDoListDAO;
	
	public void setToDoListDAO(ToDoListDAO toDoListDAO) {
		this.toDoListDAO = toDoListDAO;
	}

	public void saveTodo(ToDoDTO todo) {
		// TODO Auto-generated method stub
		toDoListDAO.persist(todo);
	}

	public void majTodo(ToDoDTO todo) {
		// TODO Auto-generated method stub
		toDoListDAO.update(todo);
	}

	public ToDoDTO rechercheTodo(long id) {
		// TODO Auto-generated method stub
		return rechercheTodo(id);
	}

	public void delete(ToDoDTO entity) {
		// TODO Auto-generated method stub
		toDoListDAO.delete(entity);
	}

	
}
