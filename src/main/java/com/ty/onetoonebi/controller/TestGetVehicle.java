package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetonebi.dto.Vehicle;

public class TestGetVehicle {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Vehicle vehicle=entityManager.find(Vehicle.class,4);
		System.out.println("Vehicle name : "+vehicle.getName());
		System.out.println("Vehicle cost : "+vehicle.getCost());
		System.out.println("Vehicle charcy : "+vehicle.getCharcy().getCharcyNumber());
		System.out.println("Vehicle type : "+vehicle.getCharcy().getType());		
	}
}
