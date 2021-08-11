package com.accenture.lkm.dao;

import java.util.List;

import com.accenture.lkm.businessbean.DoughnutBean;
import com.accenture.lkm.businessbean.LoginBean;

public interface DoughnutDao {
	public boolean validateUser(LoginBean bean);
	public Double placeOrder(DoughnutBean bean);
	

}