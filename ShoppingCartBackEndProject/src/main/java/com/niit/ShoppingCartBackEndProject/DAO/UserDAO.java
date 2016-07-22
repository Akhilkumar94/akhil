package com.niit.ShoppingCartBackEndProject.DAO;

import java.util.List;

import com.niit.ShoppingCartBackEndProject.model.User;




public interface UserDAO {
	public List<User> list();
	public User get(String id);
	public void saveOrUpdate(User user);
	public void Delete(String id);

}
