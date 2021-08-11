package com.accenture.lkm.service;

import java.util.ArrayList;
import java.util.List;

import com.accenture.lkm.businessbean.DoughnutBean;
import com.accenture.lkm.businessbean.LoginBean;
import com.accenture.lkm.dao.DoughnutDao;
import com.accenture.lkm.utility.*;
public class DoughnutServiceImpl implements DoughnutService {

	@Override
	public boolean validateUser(LoginBean bean) {
		DoughnutDao doughnutDao = DoughnutFactory.getDoughtnutDao();
		if(bean!=null)
			return doughnutDao.validateUser(bean);
		else
			return false;
	}

	@Override
	public Double placeOrder(DoughnutBean bean) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
