package com.niit.ShoppingCartBackEndProject;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCartBackEndProject.DAO.ProductDAO;
import com.niit.ShoppingCartBackEndProject.model.Product;

public  class ProductTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.niit.ShoppingCartBackEndProject");
		context.refresh();

		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");

		Product product = (Product) context.getBean("product");
		product.setId("CG120");
		product.setName("CGName120");
		product.setDescription("CGDesc120");
		product.setPrice(2000);

		productDAO.saveOrUpdate(product);

		

	}

}