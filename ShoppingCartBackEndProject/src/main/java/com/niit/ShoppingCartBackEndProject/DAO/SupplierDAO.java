package com.niit.ShoppingCartBackEndProject.DAO;

import java.util.List;

import com.niit.ShoppingCartBackEndProject.model.Supplier;


public interface SupplierDAO {
	public List<Supplier> list();
	public Supplier get(String id);
	public void saveOrUpdate(Supplier supplier);
	public void Delete(String id);

}
