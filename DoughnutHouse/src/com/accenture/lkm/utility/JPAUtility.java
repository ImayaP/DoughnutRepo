package com.accenture.lkm.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	public static EntityManagerFactory getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("JPAUnit");
	}
}
