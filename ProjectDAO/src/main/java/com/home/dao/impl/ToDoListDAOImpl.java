package com.home.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.dao.dto.ToDoDTO;
import com.home.dao.ToDoListDAO;
import com.home.model.ToDoList;

public class ToDoListDAOImpl implements ToDoListDAO{
	
	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ToDoDTO entity) {
		// TODO Auto-generated method stub
		entityManager.persist(entity);
	}

	public void update(ToDoDTO entity) {
		// TODO Auto-generated method stub
		entityManager.merge(entity);
	}

	public ToDoList findById(long id) {
		// TODO Auto-generated method stub
		return entityManager.find(ToDoList.class, id);
	}

	public void delete(ToDoDTO entity) {
		// TODO Auto-generated method stub
		entityManager.remove(entity);
	}
	
}
