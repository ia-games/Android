package com.rsofia.OnlineShop;

public abstract class Product {
	
	private double regularPrice;
	
	public Product(double _precio)
	{
		regularPrice = _precio;
	}

	public double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}
	
	public abstract double PrecioDeVenta();

}
