package com.accenture.lkm.entity;
import javax.persistence.*;
@Entity
public class DoughnutEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer donutId;
	private String donutName;
	private String donutSize;
	private Integer donutQuantity;
	private String donutFlavour;
	private String donutToppings;
		
	public Integer getDonutQuantity() {
		return donutQuantity;
	}
	public void setDonutQuantity(Integer donutQuantity) {
		this.donutQuantity = donutQuantity;
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
