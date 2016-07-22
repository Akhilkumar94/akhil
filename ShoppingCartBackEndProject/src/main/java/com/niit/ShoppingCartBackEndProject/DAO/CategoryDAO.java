package com.niit.ShoppingCartBackEndProject.DAO;

import java.util.List;

import com.niit.ShoppingCartBackEndProject.model.Category;


public interface CategoryDAO {
	public List<Category> list();
	public Category get(String id);
	public void saveOrUpdate(Category category);
	public void Delete(String id);

}
