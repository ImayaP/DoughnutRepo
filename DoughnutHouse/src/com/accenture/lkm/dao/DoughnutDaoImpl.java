package com.accenture.lkm.dao;

import javax.persistence.*;
import com.accenture.lkm.businessbean.DoughnutBean;
import com.accenture.lkm.businessbean.LoginBean;
import com.accenture.lkm.entity.LoginEntity;
import com.accenture.lkm.utility.JPAUtility;

public class DoughnutDaoImpl implements DoughnutDao {

	@Override
	public boolean validateUser(LoginBean bean) {
		boolean flag = false;
		EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select e from LoginEntity e where e.userName=?1 and e.password=:pw");
		query.setParameter(1, bean.getUserName());
		query.setParameter("pw", bean.getPassword());
		try {
		LoginEntity entity = (LoginEntity)query.getSingleResult();
		if(entity!=null)
			flag = true;
		}
		catch(NoResultException exception) {
			flag = false;
		}
		return flag;
	}

	@Override
	public Double placeOrder(DoughnutBean bean) {
		return null;
	}
	
}
