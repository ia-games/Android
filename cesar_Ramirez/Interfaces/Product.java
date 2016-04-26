package com.cesarramirez23.OnlineShop;

public abstract class Product {
	
	
	private double regularprice;
	public abstract double preciodeventa();
	public Product (double _regularprice)
	{
		this.regularprice= _regularprice;
	}
	public double getRegularprice() {
		return regularprice;
	}
	public void setRegularprice(double regularprice) {
		this.regularprice = regularprice;
	}
	
	

}
