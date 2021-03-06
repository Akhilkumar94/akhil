package com.niit.ShoppingCartBackEndProject.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShoppingCartBackEndProject.model.Supplier;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFacory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Supplier supplier) {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
	}

	@Transactional
	public void delete(String id) {
		Supplier supplierToDelete = new Supplier();
		supplierToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(supplierToDelete);
	}

	@Transactional
	public Supplier get(String id)
	{
		String hql="from supplier where id="+""+id+"";
		Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Supplier>listSupplier=(List<Supplier>)query.getResultList();
		
		if(listSupplier!=null&&listSupplier.isEmpty()){
		 return listSupplier.get(0);
	}
	return null;
	}
	@Transactional
	public List<Supplier> list()
	{
		@SuppressWarnings("unchecked")
		List<Supplier> listSupplier=(List<Supplier>)
				sessionFactory.getCurrentSession()
				.createCriteria(Supplier.class)
		        .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		        return listSupplier;
	}

	public void Delete(String id) {
		// TODO Auto-generated method stub
		
	}

	

	

	
		
	}
