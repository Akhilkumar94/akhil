package com.niit.ShoppingCartBackEndProject.DAO;

import java.util.List;

import com.niit.ShoppingCartBackEndProject.model.Product;


public interface ProductDAO {
	public List<Product> list();
	public Product get(String id);
	public void saveOrUpdate(Product product);
	public void Delete(String id);

}
