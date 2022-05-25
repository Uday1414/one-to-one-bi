package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetonebi.dto.Charcy;
import com.ty.onetonebi.dto.Vehicle;

public class TestSaveVehicleCharcy {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Vehicle vehicle=new Vehicle();
		vehicle.setName("s-cross");
		vehicle.setCost(200000);
		
		Charcy charcy=new Charcy();
		charcy.setCharcyNumber("IND998612hd");
		charcy.setType("Diesel");
		
		vehicle.setCharcy(charcy);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityTransaction.commit();
	}
}
