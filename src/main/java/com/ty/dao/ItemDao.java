package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Item;

public class ItemDao {
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	private EntityManager entityManager=entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction;
	public void createItem(Item item) {
		
	}
}
