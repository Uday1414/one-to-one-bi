package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetonebi.dto.Company;
import com.ty.onetonebi.dto.Gst;

public class TestGetGst {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		Gst gst = entityManager.find(Gst.class,1);
		System.out.println("Gst Number : "+gst.getGstNumber());
		System.out.println("Gst state : "+gst.getState());
		System.out.println("Gst Country : "+gst.getCountry());
		
		Company company=gst.getCompany();
		System.out.println("Company Name : "+company.getName());
		System.out.println("Company website : "+company.getWeb());
		
	}
}
