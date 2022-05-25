package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.ty.onetonebi.dto.*;

public class TestSavePersonPan {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("naresh");
		person.setEmail("naresh@mail.com");
		person.setPhone(9988556878l);
		
		Pan pan=new Pan();
		pan.setAddress("Kurnool");
		pan.setPanNumber("BGNPV8836P");
		
		person.setPan(pan);
		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}
}
