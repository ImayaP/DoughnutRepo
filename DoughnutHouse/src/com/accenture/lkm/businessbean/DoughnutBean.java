package com.accenture.lkm.businessbean;

import java.util.ArrayList;
import java.util.List;

public class DoughnutBean {
	private Integer donutId;
	private String donutName;
	private String donutSize;
	private String donutFlavour;
	private String donutToppings;
	
	public DoughnutBean(String donutName, String donutSize, String donutFlavour, String donutToppings) {
		super();
		this.donutName = donutName;
		this.donutSize = donutSize;
		this.donutFlavour = donutFlavour;
		this.donutToppings = donutToppings;
	}
	public Integer getDonutId() {
		return donutId;
	}
	public void setDonutId(Integer donutId) {
		this.donutId = donutId;
	}
	public String getDonutName() {
		return donutName;
	}
	public void setDonutName(String donutName) {
		this.donutName = donutName;
	}
	public String getDonutSize() {
		return donutSize;
	}
	public void setDonutSize(String donutSize) {
		this.donutSize = donutSize;
	}
	public String getDonutFlavour() {
		return donutFlavour;
	}
	public void setDonutFlavour(String donutFlavour) {
		this.donutFlavour = donutFlavour;
	}
	public String getDonutToppings() {
		return donutToppings;
	}
	public void setDonutToppings(String donutToppings) {
		this.donutToppings = donutToppings;
	}
	
	
}
