package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetonebi.dto.Company;
import com.ty.onetonebi.dto.Gst;

public class TestGetCompany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Company company=entityManager.find(Company.class,1);
		System.out.println("Company Name : "+company.getName());
		System.out.println("Company website : "+company.getWeb());
		
		Gst gst = company.getGst();
		System.out.println("Gst Number : "+gst.getGstNumber());
		System.out.println("Gst state : "+gst.getState());
		System.out.println("Gst Country : "+gst.getCountry());
	}
}
