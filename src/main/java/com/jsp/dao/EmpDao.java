package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.EmpDto;



public class EmpDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abcd");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(EmpDto empdto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(empdto);
		entityTransaction.commit();

	}
	public EmpDto fetch(String  email) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		EmpDto dto =entityManager.find(EmpDto.class,email);

		entityTransaction.commit();
		return dto;
		
	}

}
