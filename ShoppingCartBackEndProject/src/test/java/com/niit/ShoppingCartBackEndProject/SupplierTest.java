package com.niit.ShoppingCartBackEndProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCartBackEndProject.DAO.SupplierDAO;
import com.niit.ShoppingCartBackEndProject.model.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("com.niit.ShoppingCartBackEndProject");
		context.refresh();
		SupplierDAO supplierDAO =(SupplierDAO)context.getBean("supplierDAO");
		Supplier supplier =(Supplier)context.getBean("supplier");
		supplier.setId("CG120");
		supplier.setName("CGName120");
		supplier.setAddress("CGDESC120");
	supplierDAO.saveOrUpdate(supplier);
	
	
	}

}
