package com.accenture.lkm.service;

import java.util.List;

import com.accenture.lkm.businessbean.DoughnutBean;
import com.accenture.lkm.businessbean.LoginBean;

public interface DoughnutService {

	public boolean validateUser(LoginBean bean);
	public Double placeOrder(DoughnutBean bean);
	

}