package com.accenture.lkm.dao;

import java.util.List;

import com.accenture.lkm.businessbean.DoughnutBean;

public interface DoughnutDao {

	DoughnutBean addDoughnut(DoughnutBean bean);

	DoughnutBean updateDoughnut(DoughnutBean bean);

	boolean deleteDoughnut(Integer donutId);

	List<DoughnutBean> getAllDoughnuts();

	DoughnutBean getDoughnut(Integer donutId);

	DoughnutBean getDoughnut(String donutName);

}