package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetonebi.dto.Pan;
import com.ty.onetonebi.dto.Person;

public class TestGetPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person=entityManager.find(Person.class,1);
		System.out.println("Person name : "+person.getName());
		System.out.println("Person email : "+person.getEmail());
		
		Pan pan=person.getPan();
		System.out.println("Pan Address : "+pan.getAddress());
		System.out.println("Pan Number : "+pan.getPanNumber());
	}
}
