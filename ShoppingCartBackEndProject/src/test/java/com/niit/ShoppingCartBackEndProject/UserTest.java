package com.niit.ShoppingCartBackEndProject;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCartBackEndProject.DAO.UserDAO;
import com.niit.ShoppingCartBackEndProject.model.User;

public  class UserTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.niit.ShoppingCartBackEndProject");
		context.refresh();

		UserDAO userDAO = (UserDAO) context.getBean("userDAO");

		User user = (User) context.getBean("user");
		
		user.setId("CG120");
		user.setName("CGName120");
		user.setPassword("CGDesc120");
		user.setMobile("iphone");
		user.setMail("mail");
		user.setAddress("sdffg");

		userDAO.saveOrUpdate(user);

		/*if (userDAO.get("sdfsf") == null) {
			System.out.println("User does not exist");
		} else {
			System.out.println("User exist.....the details are..");
			System.out.println();
		}*/

	}

}