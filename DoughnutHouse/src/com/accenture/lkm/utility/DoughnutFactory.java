package com.accenture.lkm.utility;

import com.accenture.lkm.dao.DoughnutDao;
import com.accenture.lkm.dao.DoughnutDaoImpl;
import com.accenture.lkm.service.DoughnutService;
import com.accenture.lkm.service.DoughnutServiceImpl;

public class DoughnutFactory {
	public static DoughnutDao getDoughtnutDao() {
		return new DoughnutDaoImpl();
	}
	public static DoughnutService getDoughtnutService() {
		return new DoughnutServiceImpl();
	}
}
